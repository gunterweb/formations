package com.capgemini.formation.party;

import java.util.List;

import com.capgemini.formation.people.Friend;

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
     * The path where to put the party details
     */
    // private static final Path partyPath = Paths.get("D://Temp//party.log");

    private PartyLeader leader;

    /**
     * Create a party with a leader
     * 
     * @param leader
     *            leader
     */
    public Party(PartyLeader leader) {
        super();
        setLeader(leader);
    }

    /**
     * Create the party
     */
    public void createParty() {
        if (leader.getFriends() != null && !leader.getFriends().isEmpty()) {
            for (Friend friend : leader.getFriends()) {
                writePartyDetails(friend);
            }
        } else {
            // TODO Erreur
        }
    }

    /**
     * Write party details
     * 
     * @param friend
     *            friend
     */
    private void writePartyDetails(Friend friend) {
        System.out.println("Invited");
        System.out.println(friend.toString());
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
