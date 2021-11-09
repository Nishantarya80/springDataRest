package com.nishant.spring.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nishant.spring.data.enities.Product;
import com.nishant.spring.data.repos.ProductRepo;

@RestController
@RequestMapping("/products")
public class productController {
	
	@Autowired
	ProductRepo productRepo;
	
	@GetMapping
	public Iterable<Product> getProduct(){
		return productRepo.findAll();
	}
	
	@PostMapping
	public Product create(@RequestBody Product product) {
		return productRepo.save(product);
	}
	
	@PutMapping
	public Product update(@RequestBody Product product) {
		return productRepo.save(product);
	}
	
	@GetMapping("/{id}")
	public Product getProduct(@PathVariable Long id) {
		 Optional<Product> byId = productRepo.findById(id);
		 if(byId.isPresent())
			 return (Product)byId.get();
		 return null;
	}
	
	@DeleteMapping("/{id}")
	public String deleteProduct(@PathVariable Long id) {
		 Optional<Product> byId = productRepo.findById(id);
		 if(byId.isPresent()) {
			 productRepo.delete(byId.get());
			 return "Deleted";
			 }
		 return "Id not Found";
	}
}
