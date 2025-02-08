package com.johans.products;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.johans.products.entities.Product;
import com.johans.products.persistence.IProductRepository;

import jakarta.transaction.Transactional;

@SpringBootTest
@Transactional
class MsProductsApplicationTests {

	@Autowired
	private IProductRepository productRepository;

	@Test
	void contextLoads() {
		Product product = productRepository.findById(Long.valueOf(1)).orElse(null);
		Assertions.assertEquals(1, product.getId());
		Assertions.assertEquals("Iphone 11", product.getName());
		Assertions.assertEquals("Color blanco", product.getDescription());
	}

}
