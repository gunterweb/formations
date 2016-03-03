package com.capgemini.formation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

public class InvoiceTest {
    Invoice invoice;
    BigDecimal amount;
    Long customerId;

    @Before
    public void setUp() {
        invoice = new Invoice();
        amount = new BigDecimal(120);
        customerId = Long.valueOf(1);
    }

    @Test
    public void testInvoice() {
        assertTrue(invoice != null);
        assertEquals(invoice.getAmount(), null);
        assertEquals(invoice.getCustomerId(), null);
    }

    @Test
    public void testInvoiceWithAmount() {
        invoice.setAmount(amount);
        assertTrue(invoice != null);
        assertEquals(invoice.getAmount(), amount);
        assertEquals(invoice.getCustomerId(), null);
    }

    @Test
    public void testInvoiceWithCustomer() {
        invoice.setCustomerId(customerId);
        assertTrue(invoice != null);
        assertEquals(invoice.getAmount(), null);
        assertEquals(invoice.getCustomerId(), customerId);
    }

    @Test
    public void testInvoiceWithCustomerAndAmount() {
        invoice.setCustomerId(customerId);
        invoice.setAmount(amount);
        assertTrue(invoice != null);
        assertEquals(invoice.getAmount(), amount);
        assertEquals(invoice.getCustomerId(), customerId);
    }

}
