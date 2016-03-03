package com.capgemini.formation.people;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.formation.exception.FunctionalReason;
import com.capgemini.formation.party.PartyLeader;
import com.capgemini.formation.people.exception.FriendshipException;

/**
 * FunnyGuy
 * 
 * @author fbontemp
 *
 */
public class FunnyGuy extends AbstractPerson implements PartyLeader {

    /**
     * 
     */
    private static final long serialVersionUID = -6598508129966551385L;

    private List<Friend> friends;

    public FunnyGuy() {
        super();
        friends = new ArrayList<>();
    }

    @Override
    public List<Friend> getFriends() {
        return friends;
    }

    @Override
    public void setFriends(List<Friend> friends) {
        this.friends = friends;
    }

    @Override
    public void addFriend(Friend friend) throws FriendshipException {
        if (friend.isReadyForMojitos()) {
            friends.add(friend);
        } else {
            throw new FriendshipException(FunctionalReason.FRIEND_ERROR);
        }
    }

}
