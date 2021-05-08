package io.github.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long>{

}
