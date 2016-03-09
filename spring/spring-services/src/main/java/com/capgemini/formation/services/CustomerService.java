package com.capgemini.formation.services;

import java.io.Serializable;
import java.util.List;

import com.capgemini.formation.dto.CustomerDto;

public interface CustomerService extends Serializable {

    public void saveCustomer(CustomerDto customer);

    public CustomerDto getCustomer(Long idCustomer);

    public List<CustomerDto> getCustomers();
    
    public void deleteCustomer(CustomerDto customer);
}
