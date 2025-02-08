package com.johans.products.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.johans.products.entities.Product;

@Repository
public interface IProductRepository extends CrudRepository<Product, Long>{

}
