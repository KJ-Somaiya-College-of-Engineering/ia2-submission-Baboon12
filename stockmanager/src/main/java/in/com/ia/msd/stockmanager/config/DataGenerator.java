package in.com.ia.msd.stockmanager.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import in.com.ia.msd.stockmanager.model.Stock;
import in.com.ia.msd.stockmanager.repositories.StockRepository;

import javax.annotation.PostConstruct;

@Component
public class DataGenerator {

    private static final Logger LOGGER = LoggerFactory.getLogger(DataGenerator.class);

    private StockRepository stockRepository;

    protected DataGenerator(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    @PostConstruct
    @Transactional
    public void init() {
        LOGGER.info("Generating synthetic data for demonstration purposes...");

        stockRepository.save(new Stock("1", "12345678", 5));
        stockRepository.save(new Stock("2", "34567890", 2));
        stockRepository.save(new Stock("3", "54326745", 999));
        stockRepository.save(new Stock("4", "93847614", 0));
        stockRepository.save(new Stock("5", "11856388", 1));

        LOGGER.info("... data generation complete");
    }
}
