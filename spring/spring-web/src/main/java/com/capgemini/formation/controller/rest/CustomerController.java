package com.capgemini.formation.controller.rest;

import java.text.MessageFormat;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.formation.controller.error.ErrorMessage;
import com.capgemini.formation.dto.CustomerDto;
import com.capgemini.formation.exception.CustomerNotFoundException;
import com.capgemini.formation.services.CustomerService;

/**
 * Customer REST controller
 * 
 * @author fbontemp
 *
 */
@RestController
public class CustomerController {

    private static final String CUSTOMERID_NOTFOUND = "Customer with id {0} not found";
    private static final String CUSTOMERID_UNDELETABLE = "Unable to delete customer with id {0}";

    /** Logger */
    private static final Logger LOG = LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    CustomerService customerService;

    @ExceptionHandler(CustomerNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ResponseBody
    ErrorMessage customerNotFound(CustomerNotFoundException e) {
        return new ErrorMessage(e.getInternationalizedMessage());
    }

    /**
     * Retrieve all customers
     * 
     * @return ResponseEntity
     */
    @RequestMapping(value = "/customer/", method = RequestMethod.GET)
    public ResponseEntity<List<CustomerDto>> listAllCustomers() {
        List<CustomerDto> customers = customerService.getCustomers();
        if (customers.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(customers, HttpStatus.OK);
    }

    /**
     * Retrieve a single customer
     * 
     * @param id
     *            customer Id
     * @return ResponseEntity
     * @throws CustomerNotFoundException
     *             CustomerNotFoundException
     */
    @RequestMapping(value = "/customer/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CustomerDto> getUser(@PathVariable("id") @NotNull Long id) throws CustomerNotFoundException {
        LOG.debug("Fetching customer with id " + id);
        CustomerDto customer = customerService.getCustomer(id);
        if (customer == null) {
            LOG.error(MessageFormat.format(CUSTOMERID_NOTFOUND, id));
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }

    /**
     * Creates a customer
     * 
     * @param customer
     *            customer
     * @return ResponseEntity
     */
    @RequestMapping(value = "/customer/", method = RequestMethod.POST)
    public ResponseEntity<Void> createCustomer(@RequestBody @NotNull @Validated CustomerDto customer) {
        LOG.debug("Creating customer " + customer.getName());
        customerService.saveCustomer(customer);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    /**
     * Update a customer
     * 
     * @param id
     *            customer Id
     * @param customer
     *            customer
     * @return ResponseEntity
     * @throws CustomerNotFoundException
     *             CustomerNotFoundException
     */
    @RequestMapping(value = "/customer/{id}", method = RequestMethod.PUT)
    public ResponseEntity<CustomerDto> updateCustomer(@PathVariable("id") @NotNull Long id,
            @RequestBody @NotNull @Validated CustomerDto customer) throws CustomerNotFoundException {
        LOG.debug("Updating customer " + id);

        CustomerDto currentCustomer = customerService.getCustomer(id);

        if (currentCustomer == null) {
            LOG.error(MessageFormat.format(CUSTOMERID_NOTFOUND, id));
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        currentCustomer.setName(customer.getName());

        customerService.saveCustomer(customer);
        return new ResponseEntity<>(currentCustomer, HttpStatus.OK);
    }

    /**
     * Delete a customer
     * 
     * @param id
     *            customer Id
     * @return ResponseEntity
     * @throws CustomerNotFoundException
     *             CustomerNotFoundException
     */
    @RequestMapping(value = "/customer/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<CustomerDto> deleteCustomer(@PathVariable("id") @NotNull Long id)
            throws CustomerNotFoundException {
        LOG.debug("Fetching & Deleting customer with id " + id);

        CustomerDto customer = customerService.getCustomer(id);
        if (customer == null) {
            LOG.error(MessageFormat.format(CUSTOMERID_UNDELETABLE, id));
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        customerService.deleteCustomer(customer);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
