package com.capgemini.formation.domain.people;

/**
 * Friend class
 * 
 * @author fbontemp
 *
 */
public class Friend extends AbstractPerson {

    /**
     * 
     */
    private static final long serialVersionUID = -8164714808997044261L;

    public Friend() {
        super();
    }

    /**
     * is this friend ok ? <br>
     * means age >= 18
     * 
     * @return boolean
     */
    public boolean isCorrectFriend() {
        return getAge() != null && getAge() >= 18;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Friend name : ").append(this.getName()).append(", age : ")
                .append(this.getAge());
        return sb.toString();
    }
}
