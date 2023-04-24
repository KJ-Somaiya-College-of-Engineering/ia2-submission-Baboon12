package ia.com.msd.shopping.stockmanager.services;

import org.springframework.stereotype.Service;

import ia.com.msd.shopping.stockmanager.exceptions.StockNotFoundException;
import ia.com.msd.shopping.stockmanager.model.Stock;
import ia.com.msd.shopping.stockmanager.repositories.StockRepository;

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
