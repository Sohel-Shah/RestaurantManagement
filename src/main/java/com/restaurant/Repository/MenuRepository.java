package com.restaurant.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restaurant.Entity.Menu;


public interface MenuRepository extends JpaRepository<Menu, Integer>  {

}
