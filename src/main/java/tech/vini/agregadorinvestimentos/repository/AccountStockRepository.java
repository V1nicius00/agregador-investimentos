package tech.vini.agregadorinvestimentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.vini.agregadorinvestimentos.entity.AccountStock;
import tech.vini.agregadorinvestimentos.entity.AccountStockId;
import tech.vini.agregadorinvestimentos.entity.Stock;

public interface AccountStockRepository extends JpaRepository<AccountStock, AccountStockId> {
}
