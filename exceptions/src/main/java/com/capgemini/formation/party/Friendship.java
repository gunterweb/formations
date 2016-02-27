package com.capgemini.formation.party;

import java.io.Serializable;
import java.util.List;

import com.capgemini.formation.people.Friend;

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
