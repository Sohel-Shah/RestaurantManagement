package com.restaurant.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restaurant.Entity.Bill;

public interface BillRepository extends JpaRepository<Bill, Integer> {

}

