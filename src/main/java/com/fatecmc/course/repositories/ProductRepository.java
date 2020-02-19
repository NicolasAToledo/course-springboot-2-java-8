package com.fatecmc.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fatecmc.course.entities.Product;
//OPICIONAL USAR @Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
