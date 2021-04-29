package com.communityhub.springbootproject.dao;


import com.communityhub.springbootproject.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
