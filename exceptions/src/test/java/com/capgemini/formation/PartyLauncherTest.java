package com.capgemini.formation;

import org.junit.Assert;
import org.junit.Test;

import com.capgemini.formation.application.PartyLauncher;

public class PartyLauncherTest {

    @Test
    public void test() {
        Assert.assertTrue(PartyLauncher.launch());
    }

}
