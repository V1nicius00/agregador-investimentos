package tech.vini.agregadorinvestimentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.vini.agregadorinvestimentos.entity.Account;

import java.util.UUID;

public interface AccountRepository extends JpaRepository<Account, UUID> {
}
