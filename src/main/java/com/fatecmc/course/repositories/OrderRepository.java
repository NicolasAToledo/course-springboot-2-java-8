package com.fatecmc.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fatecmc.course.entities.Order;
//OPICIONAL USAR @Repository
public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
