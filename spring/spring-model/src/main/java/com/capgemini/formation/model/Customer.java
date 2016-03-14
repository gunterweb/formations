package com.capgemini.formation.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Customer class
 * 
 * @author fbontemp
 *
 */
@Entity
@Table(name = "CUSTOMER")
public class Customer implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -3651731302543944450L;

    /**
     * Customer Id
     */
    @NotNull
    @Id
    @Column(name = "ID", nullable = false)
    private Long idCustomer;

    /**
     * Customer name
     */
    @NotNull
    @Size(max = 255)
    @Column(name = "NAME", nullable = false)
    private String name;

    public Customer(Long id, String name) {
        this.setIdCustomer(id);
        this.setName(name);
    }

    public Customer() {
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
