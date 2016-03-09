package com.capgemini.formation.dto;

import java.io.Serializable;

public class CustomerDto implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -3794491701555213148L;
    private Long idCustomer;
    private String name;

    public CustomerDto() {
        super();
    }

    public Long getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Long idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
