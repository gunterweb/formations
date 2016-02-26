package com.capgemini.formation.domain.party;

import com.capgemini.formation.domain.people.Friend;
import com.capgemini.formation.domain.people.FunnyGuy;

/**
 * Main class to create party
 * 
 * @author fbontemp
 *
 */
public class PartyLauncher {

    /**
     * Logger
     */
    //private static final Logger LOGGER = Logger.getLogger(PartyLauncher.class);

    private PartyLauncher() {
        super();
    }

    /**
     * Main class
     * 
     * @param args
     *            arguments
     */
    public static void main(String[] args) {
        Party party = new Party();

        FunnyGuy joe = new FunnyGuy();
        joe.setName("Jo");
        joe.setAge(20);

        Friend james = new Friend();
        james.setName("James");
        james.setAge(20);

        Friend alberto = new Friend();
        alberto.setName("Alberto");
        alberto.setAge(10);

        joe.addFriend(james);
        joe.addFriend(alberto);
        party.createParty(joe);

    }

}
