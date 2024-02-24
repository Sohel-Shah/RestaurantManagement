package com.restaurant.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restaurant.Entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>  {

}
