package com.capgemini.formation;

import org.junit.Assert;
import org.junit.Test;

import com.capgemini.formation.exception.FormationException;
import com.capgemini.formation.exception.FunctionalException;
import com.capgemini.formation.exception.FunctionalReason;
import com.capgemini.formation.exception.TechnicalException;
import com.capgemini.formation.party.exception.PartyException;
import com.capgemini.formation.people.exception.FriendshipException;

public class ExceptionTest {

    private static final String MY_MESSAGE = "my message";
    private static final String FUNCTIONAL_ERROR = "Functional error";

    @Test
    public void testDefault() {
        FunctionalException e = new FunctionalException(null);
        Assert.assertEquals(e.getLocalizedMessage(), FUNCTIONAL_ERROR);
    }

    @Test
    public void testDefaultSet() {
        FunctionalException e = new FunctionalException(FunctionalReason.DEFAULT_ERROR);
        Assert.assertNotNull(e.getLocalizedMessage());
    }

    @Test
    public void testInternationalizedDefaultSet() {
        FunctionalException e = new FunctionalException(FunctionalReason.DEFAULT_ERROR);
        Assert.assertNotNull(e.getInternationalizedMessage());
    }

    @Test
    public void testInternationalizedDefault() {
        FunctionalException e = new FunctionalException(null);
        Assert.assertEquals(e.getInternationalizedMessage(), FUNCTIONAL_ERROR);
    }

    @Test
    public void testPartyDefault() {
        PartyException e = new PartyException(null);
        Assert.assertEquals(e.getLocalizedMessage(), FUNCTIONAL_ERROR);
    }

    @Test
    public void testPartyInternationalizedDefault() {
        PartyException e = new PartyException(null);
        Assert.assertEquals(e.getInternationalizedMessage(), FUNCTIONAL_ERROR);
    }

    @Test
    public void testFriendShipDefault() {
        FriendshipException e = new FriendshipException(null);
        Assert.assertEquals(e.getLocalizedMessage(), FUNCTIONAL_ERROR);
    }

    @Test
    public void testFriendShipInternationalizedDefault() {
        FriendshipException e = new FriendshipException(null);
        Assert.assertEquals(e.getInternationalizedMessage(), FUNCTIONAL_ERROR);
    }

    @Test
    public void testTechnical() {
        TechnicalException e = new TechnicalException(MY_MESSAGE);
        Assert.assertEquals(e.getLocalizedMessage(), MY_MESSAGE);
    }

    @Test
    public void testFormationException() {
        FormationException e = new TechnicalException(MY_MESSAGE);
        Assert.assertEquals(e.getLocalizedMessage(), MY_MESSAGE);
        Assert.assertEquals(e.isFunctional(), false);
        Assert.assertEquals(e.isTechnical(), true);
    }

    @Test
    public void testFormationExceptionFunctional() {
        FormationException e = new FunctionalException(null);
        Assert.assertEquals(e.getLocalizedMessage(), FUNCTIONAL_ERROR);
        Assert.assertEquals(e.isFunctional(), true);
        Assert.assertEquals(e.isTechnical(), false);
    }

}
