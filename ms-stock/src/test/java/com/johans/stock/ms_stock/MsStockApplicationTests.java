package com.johans.stock.ms_stock;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.johans.stock.ms_stock.entities.Stock;
import com.johans.stock.ms_stock.repository.IStockRepository;

import jakarta.transaction.Transactional;

@SpringBootTest
@Transactional
class MsStockApplicationTests {

	@Autowired
	private IStockRepository repository;

	@Test
	void contextLoads() {
		Stock stock  = repository.findById(Long.valueOf(1)).orElse(null);
		Assertions.assertEquals(1, stock.getId());
		Assertions.assertEquals(5, stock.getAmout());
		Assertions.assertEquals(1, stock.getProductId());
	}

}
