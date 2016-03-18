package com.capgemini.formation.bean;

import java.io.Serializable;

/**
 * Commentaire pour ResultBean
 * 
 * @author fbontemp
 *
 */
public class ResultBean implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1762657721292280066L;

    private static final String SEP = "|";

    private Integer id;
    private String value1;

    public ResultBean() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    @Override
    public String toString() {
        return new StringBuilder(this.getId()).append(SEP).append(this.getValue1()).toString();
    }

}
