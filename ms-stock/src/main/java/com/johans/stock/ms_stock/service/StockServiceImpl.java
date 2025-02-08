package com.johans.stock.ms_stock.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.johans.stock.ms_stock.entities.Stock;
import com.johans.stock.ms_stock.repository.IStockRepository;


@Service
public class StockServiceImpl implements IStockService{

    @Autowired
    private IStockRepository stockRepository;

    @Override
    public void save(Stock stock) {
        stockRepository.save(stock);
    }

    @Override
    public Stock findByproductId(Long id) {
        return stockRepository.findByproductId(id);
    }

}
