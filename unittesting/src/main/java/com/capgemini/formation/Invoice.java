package com.capgemini.formation;

import java.io.Serializable;
import java.math.BigDecimal;

public class Invoice implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -5229683058156936180L;
    private BigDecimal amount;
    private Long customerId;

    public Invoice() {
        super();
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

}
