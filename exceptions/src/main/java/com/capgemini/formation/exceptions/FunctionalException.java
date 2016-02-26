package com.capgemini.formation.exceptions;

/**
 * Main functional exception
 * 
 * @author fbontemp
 *
 */
public class FunctionalException extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = 2858350173685623737L;

    public FunctionalException(String message, Throwable cause) {
        super(message, cause);
    }

    public FunctionalException(String message) {
        super(message);
    }

    public FunctionalException(Throwable cause) {
        super(cause);
    }
}
