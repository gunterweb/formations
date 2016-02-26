package com.capgemini.formation.domain.party;

import java.util.List;

import com.capgemini.formation.domain.people.Friend;
import com.capgemini.formation.exceptions.FriendshipException;

/**
 * Party Leader interface
 * 
 * @author fbontemp
 *
 */
public interface PartyLeader {
    /**
     * @return list of Friends
     */
    public List<Friend> getFriends();

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
     * @throws FriendshipException
     *             FriendshipException
     */
    public void addFriend(Friend friend);
}
