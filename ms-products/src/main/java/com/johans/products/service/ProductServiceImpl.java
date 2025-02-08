package com.johans.products.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.johans.products.client.IStockClient;
import com.johans.products.dto.ProductStockDTO;
import com.johans.products.dto.StockDTO;
import com.johans.products.entities.Product;
import com.johans.products.persistence.IProductRepository;


@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private IProductRepository productRepository;

    @Autowired
    private IStockClient stockRepository;

    @Override
    public Product findById(Long id) {
        return productRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public void delete(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public ProductStockDTO findByIdWithStock(Long id) {
        Product product = productRepository.findById(id).orElse(new Product());
        StockDTO stockDTO = stockRepository.findStockByProductId(id);
        return ProductStockDTO.builder()
            .id(product.getId())
            .name(product.getName())
            .description(product.getDescription())
            .price(product.getPrice())
            .amout(stockDTO.getAmout())
            .build();
    }

}
