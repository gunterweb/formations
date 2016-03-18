package com.capgemini.formation.dao;

import java.sql.Connection;
import java.util.List;

import com.capgemini.formation.bean.ResultBean;
import com.capgemini.formation.exception.TechnicalException;

/**
 * Commentaire TestDAO
 * 
 * @author fbontemp
 *
 */
@FunctionalInterface
public interface TestDAO {
    /**
     * Commentaire méthode executeRequest
     * 
     * @param conn
     *            connection
     * @return List of ResultBean
     * @throws TechnicalException
     *             TechnicalException
     */
    public List<ResultBean> executeRequest(Connection conn) throws TechnicalException;
}
