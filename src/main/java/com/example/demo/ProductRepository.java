package com.example.demo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

public interface ProductRepository extends  MongoRepository<Product, String>{

	List<Product> findByNameAndQuantity(@Param("name")String name,@Param("quantity") int quantity);

	List<Product> findByName(@Param("name")String name);
	

}
