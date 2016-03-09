package com.capgemini.formation.model.dao;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.capgemini.formation.model.Customer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/spring/applicationContextTest-core.xml" })
public class CustomerRepositoryTest {
    private static final int CUSTOMER_SIZE = 6;
    @Autowired
    CustomerRepository customerRepo;

    @Before
    public void setUp() {
        for (int i = 0; i < CUSTOMER_SIZE; i++) {
            customerRepo.save(new Customer(Long.valueOf(i), "Customer " + i));
        }
    }

    @Test
    public void testOneCustomer() {

        // when
        Customer customer = customerRepo.findOne(Long.valueOf(1));

        // then
        Assert.assertEquals(customer.getIdCustomer(), Long.valueOf(1));
        Assert.assertEquals(customer.getName(), "Customer 1");
    }

    @Test
    public void testCustomerSize() {
        Assert.assertEquals(customerRepo.findAll().spliterator().estimateSize(), CUSTOMER_SIZE);
    }

    @Test
    public void testDeleteOneCustomer() {
        Customer customer = new Customer(Long.valueOf(CUSTOMER_SIZE + 1), "Customer " + (CUSTOMER_SIZE + 1));
        // when
        customerRepo.save(customer);

        // then
        Assert.assertEquals(customerRepo.findAll().spliterator().estimateSize(), (CUSTOMER_SIZE + 1));
        customerRepo.delete(customer);
        Assert.assertEquals(customerRepo.findAll().spliterator().estimateSize(), CUSTOMER_SIZE);
    }

    @After
    public void tearDown() {
        for (int i = 0; i < CUSTOMER_SIZE; i++) {
            Customer customer = customerRepo.findOne(Long.valueOf(i));
            customerRepo.delete(customer);
        }
    }

}
