package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductRepository repo;
	
		
		//Get All Products
		@RequestMapping(method=RequestMethod.GET)
		public List<Product> getAllProducts() {
			return repo.findAll();
		}
		
		//get all products, but sorted by quantity (quantity)
		@RequestMapping(method=RequestMethod.GET, params = {"quantity"})
		public List<Product> getAllProductsSortedByQuantity(@RequestParam(value = "quantity") String quantity) {
			return repo.findAll(new Sort(Sort.Direction.ASC, "quantity"));
		}
		
		//get products by Name (name)
		@RequestMapping(method=RequestMethod.GET, params = {"name"})
		public List<Product> getProductByName(@RequestParam(value = "name") String name) {
			return repo.findByName(name);
		}
		
		//get product by Name and Quantity (name & quantity)
		@RequestMapping(method=RequestMethod.GET, params = {"name", "quantity"})
		public List<Product> getProductByNameAndQuantity(@RequestParam(value = "name") String name, @RequestParam(value = "quantity") int quantity) {
			return repo.findByNameAndQuantity(name, quantity);
		}
		
		//create a product
		@RequestMapping(method=RequestMethod.POST)
		public Product create(@RequestBody Product product) {
			return repo.save(product);
		}
		
		//update a product
		@RequestMapping(method=RequestMethod.PUT, value="{id}")
		public Product update(@PathVariable String id, @RequestBody Product product) {
			Product update = repo.findOne(id);
			update.setName(product.getName());
			update.setIngredients(product.getIngredients());
			update.setQuantity(product.getQuantity());
			update.setUnit(product.getUnit());
			update.setPortionQuantity(product.getPortionQuantity());
			update.setPortionUnit(product.getPortionUnit());
			update.setNutrients(product.getNutrients());
			return repo.save(update);
		}
		
		//delete a product by ID
		@RequestMapping(method=RequestMethod.DELETE, value="{id}")
		public void delete(@PathVariable String id) {
				repo.delete(id);
	}}