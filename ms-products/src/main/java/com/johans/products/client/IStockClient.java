package com.johans.products.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.johans.products.dto.StockDTO;

@FeignClient(name = "ms-stock", url = "localhost:9090")
public interface IStockClient {

    @GetMapping("/api/stock/search-by-product/{id}")
    StockDTO findStockByProductId(@PathVariable long id);

}
