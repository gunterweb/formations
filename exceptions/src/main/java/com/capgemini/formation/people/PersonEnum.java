package com.capgemini.formation.people;

/**
 * Enumeration for persons
 * 
 * @author fbontemp
 *
 */
public enum PersonEnum {

    NEIGHBORHOOD("Neighborhood");
    private final String text;

    /**
     * @param text
     */
    private PersonEnum(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
