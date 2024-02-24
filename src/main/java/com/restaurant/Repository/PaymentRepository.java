package com.restaurant.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restaurant.Entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {

}
