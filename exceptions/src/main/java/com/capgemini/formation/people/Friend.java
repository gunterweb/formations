package com.capgemini.formation.people;

/**
 * Friend class
 * 
 * @author fbontemp
 *
 */
public class Friend extends AbstractPerson {

    public static final int CORRECT_AGE = 18;
    /**
     * 
     */
    private static final long serialVersionUID = -8164714808997044261L;

    public Friend() {
        super();
    }

    /**
     * is this friend ok for mojitos ? <br>
     * means age greater or equald to 18
     * 
     * @return boolean
     */
    public boolean isReadyForMojitos() {
        return getAge() != null && getAge().compareTo(CORRECT_AGE) >= 1;
    }

}
