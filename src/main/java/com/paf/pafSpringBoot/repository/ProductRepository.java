package com.paf.pafSpringBoot.repository;

import org.springframework.data.repository.CrudRepository;

import com.paf.pafSpringBoot.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{
	

}
