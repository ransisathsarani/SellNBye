package com.paf.pafSpringBoot.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paf.pafSpringBoot.entity.Product;
import com.paf.pafSpringBoot.repository.ProductRepository;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductRepository productRepository;
	
	//insert new product into database
	@PostMapping("/add")
	public Product addProduct(@RequestBody Product product) {
		
		return productRepository.save(product);
	}
	
	//fetch all product list from database
	@GetMapping("/all")
	public Iterable<Product> allProduct(){
		return productRepository.findAll();
	}
	
	//fetch specific product by their ID
	@GetMapping("/{pId}")
	public Optional<Product> productById(@PathVariable("pId") int pId){
		return productRepository.findById(pId);
	}
	
	//update existing product
	@PutMapping("/update/{id}")
	public Product updateProduct(@RequestBody Product product) {
		return productRepository.save(product);
	}
	
	//delete product from database
	@DeleteMapping("/{pId}")
	public void deleteProduct(@PathVariable("pId") int pId) {
		productRepository.deleteById(pId);
		
		
	}
	

}
