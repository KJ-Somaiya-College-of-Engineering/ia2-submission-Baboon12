package in.com.ia.msd.stockmanager.services;

import org.springframework.stereotype.Service;

import in.com.ia.msd.stockmanager.exceptions.StockNotFoundException;
import in.com.ia.msd.stockmanager.model.Stock;
import in.com.ia.msd.stockmanager.repositories.StockRepository;

import java.util.List;

import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class StockService {

    private StockRepository stockRepository;

    public StockService(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    public List<Stock> getStocks() {
        return StreamSupport.stream(stockRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    public Stock getStock(String productId) throws StockNotFoundException {
        return stockRepository.findById(productId)
                .orElseThrow(() -> new StockNotFoundException("Stock not found with productId: " + productId));
    }
}
