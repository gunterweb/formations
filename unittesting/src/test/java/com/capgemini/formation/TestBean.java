package com.capgemini.formation;

import java.math.BigDecimal;

class TestBean {
    private BigDecimal amount;
    private Long customerId;
    private BigDecimal checkAmount;
    private Long checkCustomer;

    TestBean(BigDecimal amount, Long customerId, BigDecimal checkAmount, Long checkCustomer) {
        this.setAmount(amount);
        this.setCustomerId(customerId);
        this.setCheckAmount(checkAmount);
        this.setCheckCustomer(checkCustomer);
    }

    BigDecimal getAmount() {
        return amount;
    }

    private void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    Long getCustomerId() {
        return customerId;
    }

    private void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    BigDecimal getCheckAmount() {
        return checkAmount;
    }

    private void setCheckAmount(BigDecimal checkAmount) {
        this.checkAmount = checkAmount;
    }

    Long getCheckCustomer() {
        return checkCustomer;
    }

    private void setCheckCustomer(Long checkCustomer) {
        this.checkCustomer = checkCustomer;
    }

}
