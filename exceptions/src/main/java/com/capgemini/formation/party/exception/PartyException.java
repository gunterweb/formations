package com.capgemini.formation.party.exception;

import com.capgemini.formation.exception.FunctionalException;
import com.capgemini.formation.exception.FunctionalReason;

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
    private static final long serialVersionUID = -3895067806908703947L;

    public PartyException(FunctionalReason functionalReason) {
        super(functionalReason);
    }

    /**
     * @param functionalReason
     *            the reason
     * @param e
     *            Exception
     */
    public PartyException(FunctionalReason functionalReason, Exception e) {
        super(functionalReason, e);
    }

}
