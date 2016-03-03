package com.capgemini.formation.application;

import org.apache.log4j.Logger;

import com.capgemini.formation.exception.FunctionalException;
import com.capgemini.formation.exception.TechnicalException;
import com.capgemini.formation.party.Party;
import com.capgemini.formation.party.PartyFactory;
import com.capgemini.formation.people.Friend;
import com.capgemini.formation.people.FunnyGuy;

/**
 * Main class to create a party
 * 
 * @author fbontemp
 *
 */
public class PartyLauncher {

    /**
     * Logger
     */
    private static final Logger LOGGER = Logger.getLogger(PartyLauncher.class);

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
        LOGGER.debug("Entering method");
        FunnyGuy joe = new FunnyGuy();
        joe.setName("Jo");
        joe.setAge(20);

        Friend james = new Friend();
        james.setName("James");
        james.setAge(20);

        Friend alberto = new Friend();
        alberto.setName("Alberto");
        alberto.setAge(10);

        try {
            joe.addFriend(james);
            //joe.addFriend(alberto);
            Party party = PartyFactory.getInstance().createParty(joe);
            party.writeParty();
        } catch (FunctionalException | TechnicalException e) {
            LOGGER.error(e.getLocalizedMessage(), e);
        }
        LOGGER.debug("Exiting method");
    }

}
