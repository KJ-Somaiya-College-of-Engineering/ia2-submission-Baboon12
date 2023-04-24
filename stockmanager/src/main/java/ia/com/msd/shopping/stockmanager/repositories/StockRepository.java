package ia.com.msd.shopping.stockmanager.repositories;

import org.springframework.data.repository.CrudRepository;

import ia.com.msd.shopping.stockmanager.model.Stock;

public interface StockRepository extends CrudRepository<Stock, String> {
}
