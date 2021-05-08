package io.github.dsvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import io.github.dsvendas.dto.SaleSuccessDTO;
import io.github.dsvendas.dto.SaleSumDTO;
import io.github.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{
	
	@Query("SELECT new io.github.dsvendas.dto.SaleSumDTO(obj.seller, SUM (obj.amount)) "
			+ "FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSumDTO> amountGroupedBySeller();
	
	@Query("SELECT new io.github.dsvendas.dto.SaleSuccessDTO(obj.seller, SUM (obj.visited), SUM (obj.deals)) "
			+ "FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSuccessDTO> sucessGroupedBySeller();

}
