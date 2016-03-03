package com.capgemini.formation.exception;

/**
 * Enum for functional reasons
 * @author fbontemp
 *
 */
public enum FunctionalReason {

    DEFAULT_ERROR("default.error"),
    FRIEND_ERROR("friend.error"),
    NO_GUEST("noguest.error"),
    ;

    private final String key;

    private FunctionalReason(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

}
