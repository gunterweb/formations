package com.capgemini.formation.people;

import java.io.Serializable;
import java.util.List;

/**
 * Friendship interface
 * 
 * @author fbontemp
 *
 */
@FunctionalInterface
public interface Friendship extends Serializable {
    /**
     * @return list of Friends
     */
    public List<Friend> getFriends();
}
