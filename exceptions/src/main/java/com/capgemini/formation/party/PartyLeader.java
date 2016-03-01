package com.capgemini.formation.party;

import java.util.List;

import com.capgemini.formation.people.Friend;
import com.capgemini.formation.people.Friendship;

/**
 * Party Leader interface
 * 
 * @author fbontemp
 *
 */
public interface PartyLeader extends Friendship {

    /**
     * Define the list of Friends
     * 
     * @param friends
     *            friends
     */
    public void setFriends(List<Friend> friends);

    /**
     * Add a friend to the List
     * 
     * @param friend
     *            friend
     */
    public void addFriend(Friend friend);
}
