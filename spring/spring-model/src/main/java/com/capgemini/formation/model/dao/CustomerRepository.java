package com.capgemini.formation.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.formation.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
