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

    private static final String UNKNOWN = "unknown";

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Name : ").append(this.getName() == null ? UNKNOWN : this.getName())
                .append(", age : ").append(this.getAge() == null ? UNKNOWN : this.getAge());
        return sb.toString();
    }

}
