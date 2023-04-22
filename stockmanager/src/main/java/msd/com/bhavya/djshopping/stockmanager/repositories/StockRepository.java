package msd.com.bhavya.djshopping.stockmanager.repositories;

import org.springframework.data.repository.CrudRepository;

import msd.com.bhavya.djshopping.stockmanager.model.Stock;

public interface StockRepository extends CrudRepository<Stock, String> {
}
