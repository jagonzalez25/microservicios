package com.johans.stock.ms_stock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.johans.stock.ms_stock.entities.Stock;
import com.johans.stock.ms_stock.service.IStockService;

@RestController
@RequestMapping("/api/stock")
public class StockController {

    @Autowired
    private IStockService stockService;

    @PutMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody Stock stock) {
         stockService.save(stock);
    }   
    
    @GetMapping("/search-by-product/{id}")
    public ResponseEntity<?> findByProductId(@PathVariable long id) {
        return ResponseEntity.ok(stockService.findByproductId(id));
    }    

}
