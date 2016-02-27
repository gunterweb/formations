package com.capgemini.formation.exception;

/**
 * Main technical exception
 * 
 * @author fbontemp
 *
 */
public class TechnicalException extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = 2858350173685623737L;

    public TechnicalException(String message, Throwable cause) {
        super(message, cause);
    }

    public TechnicalException(String message) {
        super(message);
    }

    public TechnicalException(Throwable cause) {
        super(cause);
    }
}
