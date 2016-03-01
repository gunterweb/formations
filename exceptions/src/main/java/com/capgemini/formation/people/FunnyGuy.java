package com.capgemini.formation.people;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.formation.party.PartyLeader;

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
    public void addFriend(Friend friend) {
        if (friend.isReadyForMojitos()) {
            friends.add(friend);
        } else {
            // TODO erreur
        }
    }

}
