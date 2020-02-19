package com.fatecmc.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fatecmc.course.entities.OrderItem;
//OPICIONAL USAR @Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
