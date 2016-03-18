package com.capgemini.formation;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.capgemini.formation.dao.TestDAOTest;

/**
 * Test suite
 * 
 * @author fbontemp
 *
 */
@RunWith(Suite.class)
@SuiteClasses({ TestDAOTest.class, ExceptionTest.class })
public class AllTests {

}
