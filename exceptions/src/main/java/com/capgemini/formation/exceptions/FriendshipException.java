package com.capgemini.formation.exceptions;

/**
 * FriendshipException
 * 
 * @author fbontemp
 *
 */
public class FriendshipException extends FunctionalException {

    /**
     * 
     */
    private static final long serialVersionUID = 2858350173685623737L;

    public FriendshipException(String message, Throwable cause) {
        super(message, cause);
    }

    public FriendshipException(String message) {
        super(message);
    }

    public FriendshipException(Throwable cause) {
        super(cause);
    }

}
