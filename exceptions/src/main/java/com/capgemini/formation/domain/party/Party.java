package com.capgemini.formation.domain.party;

import com.capgemini.formation.domain.people.Friend;
import com.capgemini.formation.exceptions.PartyException;

/**
 * Yeah : party !
 * 
 * @author fbontemp
 *
 */
public class Party {
    /**
     * The path where to put the party details
     */
    // private static final Path partyPath = Paths.get("D://Temp//party.log");

    public Party() {
        super();
    }

    /**
     * Create the party
     * 
     * @param leader
     *            leader
     * @throws PartyException
     *             PartyException
     */
    public void createParty(PartyLeader leader) {
        if (leader != null) {
            for (Friend friend : leader.getFriends()) {
                writePartyDetails(friend);
            }
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
}
