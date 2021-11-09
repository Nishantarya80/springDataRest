package com.nishant.spring.data;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.nishant.spring.data.enities.Product;
import com.nishant.spring.data.repos.ProductRepo;

@SpringBootTest
class SpringdatajpaApplicationTests {
	
	@Autowired
	ApplicationContext context;
	@Test
	void saveProduct() {
		ProductRepo repo =	context.getBean(ProductRepo.class);
		
//		Product entity = new Product();
//		entity.setId(12L);
//		entity.setName("mac");
//		entity.setDescription("good");
//		entity.setPrice(1200D);
//		repo.save(entity);
		
//		repo.findAll().forEach(System.out::println);
//		
//		Optional<Product> findById = repo.findById(2L);
//		if(findById.isPresent()) {
//			Product product = findById.get();
//			product.setPrice(1500D);
//			repo.save(product);
//		}
//		
//		repo.findAll().forEach(System.out::println);
		
		System.out.println(repo.findByName("mac"));
		
		
	}

}
