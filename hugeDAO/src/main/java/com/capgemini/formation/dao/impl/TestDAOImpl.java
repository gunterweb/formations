package com.capgemini.formation.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.capgemini.formation.bean.ResultBean;
import com.capgemini.formation.dao.TestDAO;
import com.capgemini.formation.exception.TechnicalException;
import com.capgemini.formation.utils.PropertyHelper;

/**
 * Commentaire TestDAOImpl
 * 
 * @author fbontemp
 *
 */
public class TestDAOImpl implements TestDAO {
    /**
     * Logger
     */
    private static final Logger LOGGER = Logger.getLogger(TestDAOImpl.class);
    private static final String EXECUTION_TIME_KEY = "message.execTime";

    private static final StringBuilder SQL_REQUEST = new StringBuilder("SELECT TABLE1.ID, ")
            .append("(CASE TABLE1.VALUE1 WHEN 'TEST2' THEN TABLE1.VALUE2 ELSE TABLE1.VALUE1 END) ")
            .append("FROM TABLE1, TABLE2 ").append("WHERE TABLE2.ID = TABLE1.FKID ")
            .append("AND ((TABLE1.VALUE1 = 'TEST2') ").append("OR (TABLE1.VALUE1 <> 'TEST2' ")
            .append("AND VALUE5 NOT IN (SELECT VALUE FROM TABLE3 WHERE DISCR <> '0') ").append("AND VALUE3 = 'VAL' ")
            .append("AND VALUE4 IN ('VAL','VAL2'))) ORDER BY 1 ASC");

    @Override
    public List<ResultBean> executeRequest(Connection conn) throws TechnicalException {
        Long before = System.currentTimeMillis();
        String execMessage = PropertyHelper.getMessageProperty(EXECUTION_TIME_KEY);
        try (PreparedStatement st = conn.prepareStatement(SQL_REQUEST.toString()); ResultSet rs = st.executeQuery()) {
            List<ResultBean> beans = new ArrayList<>();
            while (rs.next()) {
                ResultBean bean = new ResultBean();
                bean.setId(rs.getInt(1));
                bean.setValue1(rs.getString(2));
                beans.add(bean);
            }
            return beans;
        } catch (SQLException e) {
            throw new TechnicalException(e);
        } finally {
            LOGGER.info(MessageFormat.format(execMessage, System.currentTimeMillis() - before));
        }
    }

}
