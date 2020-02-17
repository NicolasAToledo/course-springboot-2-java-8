package com.fatecmc.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fatecmc.course.entities.User;
//OPICIONAL USAR @Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
}
