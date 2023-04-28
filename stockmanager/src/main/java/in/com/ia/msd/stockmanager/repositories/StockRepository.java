package in.com.ia.msd.stockmanager.repositories;

import org.springframework.data.repository.CrudRepository;

import in.com.ia.msd.stockmanager.model.Stock;

public interface StockRepository extends CrudRepository<Stock, String> {
}
