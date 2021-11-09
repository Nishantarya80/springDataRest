package com.nishant.spring.data.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nishant.spring.data.enities.Product;

@Repository
public interface ProductRepo extends CrudRepository<Product, Long> {
	public List<Product> findByName(String name);
}
