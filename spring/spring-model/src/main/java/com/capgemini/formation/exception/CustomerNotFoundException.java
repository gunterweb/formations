package com.capgemini.formation.exception;

/**
 * Customer not found exception
 * 
 * @author fbontemp
 *
 */
public class CustomerNotFoundException extends FunctionalException {
    /**
     * 
     */
    private static final long serialVersionUID = -3895067806908703947L;

    public CustomerNotFoundException(FunctionalReason functionalReason, Long idCustomer) {
        super(functionalReason, idCustomer);
    }

    /**
     * @param functionalReason
     *            the reason
     * @param e
     *            Exception
     */
    public CustomerNotFoundException(FunctionalReason functionalReason, Exception e, Long idCustomer) {
        super(functionalReason, e, idCustomer);

    }

}
