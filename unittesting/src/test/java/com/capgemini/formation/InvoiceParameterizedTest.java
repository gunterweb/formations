package com.capgemini.formation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class InvoiceParameterizedTest {
    Invoice invoice;

    BigDecimal amount;
    Long customerId;
    BigDecimal checkAmount;
    Long checkCustomer;

    @Before
    public void setUp() {
        invoice = new Invoice();
    }

    @Test
    public void testInvoice() {
        assertTrue(invoice != null);
        invoice.setCustomerId(customerId);
        invoice.setAmount(amount);
        assertEquals(invoice.getAmount(), checkAmount);
        assertEquals(invoice.getCustomerId(), checkCustomer);
    }

    public InvoiceParameterizedTest(TestBean bean) {
        this.customerId = bean.getCustomerId();
        this.amount = bean.getAmount();
        this.checkAmount = bean.getCheckAmount();
        this.checkCustomer = bean.getCheckCustomer();
    }

    @Parameterized.Parameters
    public static Collection<TestBean> elements() {
        List<TestBean> elements = new ArrayList<>();
        elements.add(new TestBean(null, null, null, null));
        elements.add(new TestBean(BigDecimal.valueOf(120), null, BigDecimal.valueOf(120), null));
        elements.add(new TestBean(null, Long.valueOf(1), null, Long.valueOf(1)));
        elements.add(new TestBean(BigDecimal.valueOf(120), Long.valueOf(1), BigDecimal.valueOf(120), Long.valueOf(1)));
        return elements;
    }

}
