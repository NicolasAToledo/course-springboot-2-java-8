package com.fatecmc.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fatecmc.course.entities.Category;


//OPICIONAL USAR @Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
