package com.johans.stock.ms_stock.service;

import com.johans.stock.ms_stock.entities.Stock;

public interface IStockService {

    void save(Stock stock);

    Stock findByproductId(Long id);

}
