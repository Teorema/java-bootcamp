package com.globant.app;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.globant.entities.User;

@Repository
public interface UserRepository extends MongoRepository<User, Integer>{

	User findByUsername(String username);
	
}
