package com.capgemini.formation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.capgemini.formation.party.Party;
import com.capgemini.formation.people.Friend;
import com.capgemini.formation.people.FunnyGuy;

/**
 * Test case for Party class
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

    @Test
    public void testNoFriends() {
        Party party = new Party(joe);
        party.createParty();
        Assert.assertEquals(party.getFriends().size(), 0);
    }
    
    @Test
    public void testWithFriends() {
        Party party = new Party(joe);
        joe.addFriend(james);
        party.createParty();
        Assert.assertEquals(party.getFriends().size(), 1);
    }

}
