package msd.com.bhavya.djshopping.stockmanager.resources;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import msd.com.bhavya.djshopping.stockmanager.exceptions.StockNotFoundException;
import msd.com.bhavya.djshopping.stockmanager.model.Stock;
import msd.com.bhavya.djshopping.stockmanager.services.StockService;

import java.util.List;

@RestController
@RequestMapping("/stocks")
public class StockResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(StockResource.class);

    @Autowired
    private StockService stockService;

    @GetMapping()
    public List<Stock> getStocks() {
        LOGGER.info("getStocks (All stocks)");
        return stockService.getStocks();
    }

    @GetMapping("{productId}")
    public Stock getStock(@PathVariable String productId) throws StockNotFoundException {
        LOGGER.info("getStock with productId: {}", productId);
        return stockService.getStock(productId);
    }

    @ExceptionHandler
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public void handleStockNotFound(StockNotFoundException snfe) {
    }
}