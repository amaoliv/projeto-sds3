package io.github.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.dsvendas.entities.Sale;
import io.github.dsvendas.entities.Seller;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
