package com.capgemini.formation.exception;

public class FormationException extends Exception {
    private final boolean functional;
    /**
     * 
     */
    private static final long serialVersionUID = 64772415297374564L;

    public FormationException(String message, Throwable cause) {
        super(message, cause);
        this.functional = checkFunctionalException(cause);
    }

    public FormationException(String message) {
        super(message);
        this.functional = checkFunctionalException();
    }

    public FormationException() {
        super();
        this.functional = checkFunctionalException();
    }

    public FormationException(Throwable cause) {
        super(cause);
        this.functional = checkFunctionalException(cause);
    }

    public boolean isFunctional() {
        return functional;
    }

    public boolean isTechnical() {
        return !functional;
    }

    private boolean checkFunctionalException() {
        return this instanceof FunctionalException;

    }

    private boolean checkFunctionalException(Throwable cause) {
        return cause instanceof FunctionalException;
    }
}
