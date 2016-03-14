package com.capgemini.formation.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.formation.model.Customer;

/**
 * JpaRepository for Customer
 * 
 * @author fbontemp
 *
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
