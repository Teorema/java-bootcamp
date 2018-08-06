package com.globant.app;

import java.util.Collection;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.globant.entities.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, Integer>{
	
	Collection<Product> findByCategory(int category);
	Collection<Product> findByName(String name);

}
