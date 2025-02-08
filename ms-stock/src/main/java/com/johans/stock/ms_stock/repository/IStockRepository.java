package com.johans.stock.ms_stock.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.johans.stock.ms_stock.entities.Stock;

@Repository
public interface IStockRepository extends CrudRepository<Stock, Long>{

    Stock findByproductId(Long id);

}
