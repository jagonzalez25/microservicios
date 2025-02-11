package com.johans.products.service;

import java.util.List;

import com.johans.products.dto.ProductStockDTO;
import com.johans.products.entities.Product;

public interface IProductService {

    Product findById(Long id);

    List<Product> findAll();

    void save(Product product);

    void delete(Long id);

    ProductStockDTO findByIdWithStock(Long id);

}
