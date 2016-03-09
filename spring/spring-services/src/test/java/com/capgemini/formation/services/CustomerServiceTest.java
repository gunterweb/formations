package com.capgemini.formation.services;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.AfterTransaction;
import org.springframework.test.context.transaction.BeforeTransaction;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.formation.dto.CustomerDto;
import com.capgemini.formation.services.impl.CustomerServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/spring/applicationContextTest-services.xml" })
@Transactional
public class CustomerServiceTest {
    /** Logger */
    private static final Logger LOG = LoggerFactory.getLogger(CustomerServiceImpl.class);

    @Autowired
    private CustomerService customerService;

    private CustomerDto dto;

    @BeforeTransaction
    public void beforeTransaction() {
        LOG.debug("beforeTransaction");
        dto = new CustomerDto();
        dto.setIdCustomer(Long.valueOf(1));
        dto.setName("Customer 1");
    }

    @Test
    public void testSaveDto() {
        Assert.assertEquals(customerService.getCustomers().size(), 0);
        customerService.saveCustomer(dto);
        Assert.assertEquals(customerService.getCustomers().size(), 1);
    }
    
    @Test
    public void testDeleteDto() {
        Assert.assertEquals(customerService.getCustomers().size(), 0);
        customerService.saveCustomer(dto);
        Assert.assertEquals(customerService.getCustomers().size(), 1);
        customerService.deleteCustomer(dto);
        Assert.assertEquals(customerService.getCustomers().size(), 0);
    }

    @AfterTransaction
    public void afterTransaction() {
        LOG.debug("afterTransaction");
        customerService.deleteCustomer(dto);
    }

}
