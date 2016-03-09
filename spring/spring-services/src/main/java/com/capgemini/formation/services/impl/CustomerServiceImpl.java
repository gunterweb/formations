package com.capgemini.formation.services.impl;

import java.util.List;

import org.dozer.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.formation.dto.CustomerDto;
import com.capgemini.formation.helper.DozerHelper;
import com.capgemini.formation.model.Customer;
import com.capgemini.formation.model.dao.CustomerRepository;
import com.capgemini.formation.services.CustomerService;

@Service("CustomerService")
@Transactional
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private transient Mapper mapper;

    @Autowired
    private transient CustomerRepository repository;
    /**
     * 
     */
    private static final long serialVersionUID = 3333647044881043947L;
    /** Logger */
    private static final Logger LOG = LoggerFactory.getLogger(CustomerServiceImpl.class);

    public CustomerServiceImpl() {
        super();
    }

    @Override
    public void saveCustomer(CustomerDto customer) {
        LOG.debug("saving customer");
        Customer entity = mapper.map((CustomerDto) customer, Customer.class);
        repository.save(entity);

    }

    @Override
    public CustomerDto getCustomer(Long idCustomer) {
        LOG.debug("getting customer");
        Customer entity = repository.findOne(idCustomer);
        return mapper.map((Customer) entity, CustomerDto.class);
    }

    @Override
    public List<CustomerDto> getCustomers() {
        LOG.debug("getting customers");
        return DozerHelper.map(mapper, repository.findAll(), CustomerDto.class);
    }

    @Override
    public void deleteCustomer(CustomerDto customer) {
        LOG.debug("deleting customer");
        repository.delete(mapper.map((CustomerDto) customer, Customer.class));

    }

}
