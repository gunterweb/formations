package com.capgemini.formation.services;

import java.io.Serializable;
import java.util.List;

import com.capgemini.formation.dto.CustomerDto;
import com.capgemini.formation.exception.CustomerNotFoundException;

/**
 * Customer Service
 * 
 * @author fbontemp
 *
 */
public interface CustomerService extends Serializable {

    /**
     * Saves a customer
     * 
     * @param customer
     *            customer
     */
    public void saveCustomer(CustomerDto customer);

    /**
     * Gets a customer
     * 
     * @param idCustomer
     *            idCustomer
     * @return CustomerDto
     * @throws CustomerNotFoundException
     *             CustomerNotFoundException
     */
    public CustomerDto getCustomer(Long idCustomer) throws CustomerNotFoundException;

    /**
     * Gets the list of customers
     * 
     * @return List of CustomerDto
     */
    public List<CustomerDto> getCustomers();

    /**
     * Deletes a customer
     * 
     * @param customer
     *            customer
     */
    public void deleteCustomer(CustomerDto customer);
}
