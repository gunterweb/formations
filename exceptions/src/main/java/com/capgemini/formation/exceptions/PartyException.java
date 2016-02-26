package com.capgemini.formation.exceptions;

/**
 * Party exception
 * 
 * @author fbontemp
 *
 */
public class PartyException extends FunctionalException {

    /**
     * 
     */
    private static final long serialVersionUID = 2858350173685623737L;

    public PartyException(String message, Throwable cause) {
        super(message, cause);
    }

    public PartyException(String message) {
        super(message);
    }

    public PartyException(Throwable cause) {
        super(cause);
    }
}
