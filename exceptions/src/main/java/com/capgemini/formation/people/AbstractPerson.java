package com.capgemini.formation.people;

/**
 * 
 * Abstract person class
 * 
 * @author fbontemp
 * 
 */
public abstract class AbstractPerson implements Person {
    /**
     * 
     */
    private static final long serialVersionUID = 3723482347470222267L;

    private String name;
    private Integer age;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Integer getAge() {
        return this.age;
    }

    @Override
    public void setAge(Integer age) {
        this.age = age;
    }

}
