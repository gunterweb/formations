package com.capgemini.formation.dao;

import static org.junit.Assert.assertEquals;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.capgemini.formation.bean.ResultBean;
import com.capgemini.formation.dao.impl.TestDAOImpl;
import com.capgemini.formation.exception.TechnicalException;

/**
 * JUnit test for TestDAO
 * 
 * @author fbontemp
 *
 */
public class TestDAOTest {
    /**
     * Logger
     */
    private static final Logger LOGGER = Logger.getLogger(TestDAOTest.class);

    private static final String DRIVER_TEST = "org.h2.Driver";
    private static final String USER_TEST = "SA";
    private static final String URL_TEST = "jdbc:h2:tcp://localhost/~/daoTest";

    Connection conn;

    @Before
    public void setUp() throws SQLException, ClassNotFoundException {
        Class.forName(DRIVER_TEST);
        conn = DriverManager.getConnection(URL_TEST, USER_TEST, "");
    }

    @Test
    public void testDAO() throws TechnicalException {
        TestDAO dao = new TestDAOImpl();
        List<ResultBean> beans = dao.executeRequest(conn);
        assertEquals(beans.size(), 5);
        for (ResultBean bean : beans) {
            LOGGER.debug(bean);
        }
    }

    @After
    public void tearDown() throws SQLException {
        if (conn != null) {
            conn.close();
        }
    }

}
