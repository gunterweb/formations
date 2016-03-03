package com.capgemini.formation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.capgemini.formation.exception.FunctionalException;
import com.capgemini.formation.exception.TechnicalException;
import com.capgemini.formation.party.Party;
import com.capgemini.formation.party.PartyFactory;
import com.capgemini.formation.party.exception.PartyException;
import com.capgemini.formation.people.Friend;
import com.capgemini.formation.people.FunnyGuy;

/**
 * Test case for Party class
 * 
 * @author fbontemp
 *
 */
public class PartyTest {
    FunnyGuy joe;
    Friend james;

    @Before
    public void setUp() {
        joe = new FunnyGuy();
        joe.setName("Jo");
        joe.setAge(20);

        james = new Friend();
        james.setName("James");
        james.setAge(20);

    }

    @Test(expected = PartyException.class)
    public void testNoFriends() throws PartyException, TechnicalException {
        Party party = PartyFactory.getInstance().createParty(joe);
        party.writeParty();
        Assert.assertEquals(party.getFriends().size(), 0);
    }

    @Test
    public void testWithFriends() throws FunctionalException, TechnicalException {
        Party party = PartyFactory.getInstance().createParty(joe);
        joe.addFriend(james);
        party.writeParty();
        Assert.assertEquals(party.getFriends().size(), 1);
    }

}
