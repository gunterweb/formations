package com.capgemini.formation.exceptions;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.capgemini.formation.domain.people.Friend;
import com.capgemini.formation.domain.people.FunnyGuy;

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
    public void testAddJames() {
        joe.addFriend(james);
        Assert.assertEquals(joe.getFriends().size(), 1);
    }

    //@Test(expected = FriendshipException.class)
    @Test
    public void testAddAllFriends() {
        joe.addFriend(james);
        joe.addFriend(alberto);
        Assert.assertEquals(joe.getFriends().size(), 1);
    }

  //@Test(expected = FriendshipException.class)
    @Test
    public void testAddAlberto() {
        joe.addFriend(alberto);
        Assert.assertEquals(joe.getFriends().size(), 0);
    }

}
