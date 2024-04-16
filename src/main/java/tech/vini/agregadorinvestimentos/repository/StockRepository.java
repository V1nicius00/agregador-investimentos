package tech.vini.agregadorinvestimentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.vini.agregadorinvestimentos.entity.Account;
import tech.vini.agregadorinvestimentos.entity.Stock;

import java.util.UUID;

public interface StockRepository extends JpaRepository<Stock, String> {
}
