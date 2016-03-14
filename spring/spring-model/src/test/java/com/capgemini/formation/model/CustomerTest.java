package com.capgemini.formation.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;


public class CustomerTest {

    Customer customer;
    String name;
    Long customerId;

    @Before
    public void setUp() {
        customer = new Customer();
        name = "Dany";
        customerId = Long.valueOf(1);
    }

    @Test
    public void testCustomer() {
        assertTrue(customer != null);
        assertEquals(customer.getName(), null);
        assertEquals(customer.getIdCustomer(), null);
    }

    @Test
    public void testCustomerWithName() {
        customer.setName(name);
        assertTrue(customer != null);
        assertEquals(customer.getName(), name);
        assertEquals(customer.getIdCustomer(), null);
    }

    @Test
    public void testCustomerWithId() {
        customer.setIdCustomer(customerId);
        assertTrue(customer != null);
        assertEquals(customer.getName(), null);
        assertEquals(customer.getIdCustomer(), customerId);
    }

    @Test
    public void testCustomerWithIdAndName() {
        customer.setIdCustomer(customerId);
        customer.setName(name);
        assertTrue(customer != null);
        assertEquals(customer.getName(), name);
        assertEquals(customer.getIdCustomer(), customerId);
    }

}
