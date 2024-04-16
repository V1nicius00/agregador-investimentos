package tech.vini.agregadorinvestimentos.service;

import org.springframework.stereotype.Service;
import tech.vini.agregadorinvestimentos.dto.stock.CreateStockDto;
import tech.vini.agregadorinvestimentos.entity.Stock;
import tech.vini.agregadorinvestimentos.repository.StockRepository;

@Service
public class StockService {

    private final StockRepository stockRepository;

    public StockService(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    public void createStock(CreateStockDto createStockDto) {
        var stock = new Stock(
                createStockDto.stockId(),
                createStockDto.description()
        );
        stockRepository.save(stock);
    }
}
