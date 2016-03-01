package com.capgemini.formation.party;

import java.text.MessageFormat;
import java.util.List;

import com.capgemini.formation.people.Friend;
import com.capgemini.formation.people.Friendship;

/**
 * Yeah : party !
 * 
 * @author fbontemp
 *
 */
public class Party implements Friendship {

    /**
     * 
     */
    private static final long serialVersionUID = 1544715696612984574L;

    /**
     * the Party Leader
     */
    private PartyLeader leader;

    /**
     * Create a party with a leader
     * 
     * @param leader
     *            leader
     */
    protected Party(PartyLeader leader) {
        super();
        setLeader(leader);
    }

    /**
     * write the party invitation
     */
    public void writeParty() {
        if (leader.getFriends() != null && !leader.getFriends().isEmpty()) {
            for (Friend friend : leader.getFriends()) {
                writePartyDetails(friend);
            }
        } else {
            // TODO erreur
        }
    }

    /**
     * Write party details
     * 
     * @param friend
     *            friend
     */
    private void writePartyDetails(Friend friend) {
        System.out.println(MessageFormat.format(PartyFactory.messageTemplate,
                friend.getName() == null ? PartyFactory.unknownProperty : friend.getName(),
                friend.getAge() == null ? PartyFactory.unknownProperty : friend.getAge(),
                friend.getAddress() == null ? PartyFactory.unknownProperty : friend.getAddress()));
    }

    public PartyLeader getLeader() {
        return leader;
    }

    public void setLeader(PartyLeader leader) {
        this.leader = leader;
    }

    @Override
    public List<Friend> getFriends() {
        return leader.getFriends();
    }
}
