package com.capgemini.formation.people.exception;

import com.capgemini.formation.exception.FunctionalException;
import com.capgemini.formation.exception.FunctionalReason;

/**
 * Friendship Exception
 * 
 * @author fbontemp
 *
 */
public class FriendshipException extends FunctionalException {

    /**
     * 
     */
    private static final long serialVersionUID = -1405420040440053176L;

    public FriendshipException(FunctionalReason functionalReason) {
        super(functionalReason);
    }

}
