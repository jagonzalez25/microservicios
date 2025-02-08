package com.johans.products.service;

import com.johans.products.dto.ProductStockDTO;
import com.johans.products.entities.Product;

public interface IProductService {

    Product findById(Long id);

    void save(Product product);

    void delete(Long id);

    ProductStockDTO findByIdWithStock(Long id);

}
