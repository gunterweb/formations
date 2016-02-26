package com.capgemini.formation.domain.people;

import java.io.Serializable;

/**
 * Person interface
 * 
 * @author fbontemp
 *
 */
public interface Person extends Serializable {
    public String getName();

    public void setName(String name);

    public Integer getAge();

    public void setAge(Integer age);
}
