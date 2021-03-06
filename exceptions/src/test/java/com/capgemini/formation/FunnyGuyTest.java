package com.capgemini.formation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.capgemini.formation.people.Friend;
import com.capgemini.formation.people.FunnyGuy;
import com.capgemini.formation.people.exception.FriendshipException;

/**
 * Test case for FunnyGuy class
 * 
 * @author fbontemp
 *
 */
public class FunnyGuyTest {
    FunnyGuy joe;
    Friend james;
    Friend alberto;

    @Before
    public void setUp() {
        joe = new FunnyGuy();
        joe.setName("Jo");
        joe.setAge(20);

        james = new Friend();
        james.setName("James");
        james.setAge(20);

        alberto = new Friend();
        alberto.setName("Alberto");
        alberto.setAge(10);
    }

    @Test
    public void testAddJames() throws FriendshipException {
        joe.addFriend(james);
        Assert.assertEquals(joe.getFriends().size(), 1);
    }

    @Test(expected = FriendshipException.class)
    public void testAddAllFriends() throws FriendshipException {
        joe.addFriend(james);
        joe.addFriend(alberto);
        Assert.assertEquals(joe.getFriends().size(), 1);
    }

    @Test(expected = FriendshipException.class)
    public void testAddAlberto() throws FriendshipException {
        joe.addFriend(alberto);
        Assert.assertEquals(joe.getFriends().size(), 0);
    }

}
