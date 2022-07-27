package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.User;

public interface UserRepository extends CrudRepository<User, Integer>{

	public List<User> findByName(String name);
	
	@Query(value = "select * from user", nativeQuery = true)
	public List<User> getUser();
}
