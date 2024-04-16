package tech.vini.agregadorinvestimentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.vini.agregadorinvestimentos.entity.Account;
import tech.vini.agregadorinvestimentos.entity.BillingAddress;

import java.util.UUID;

public interface BillingAddressRepository extends JpaRepository<BillingAddress, UUID> {
}
