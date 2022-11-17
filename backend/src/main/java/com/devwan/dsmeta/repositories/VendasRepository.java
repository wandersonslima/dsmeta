package com.devwan.dsmeta.repositories;

import java.time.LocalDate;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devwan.dsmeta.entities.Vendas;

public interface VendasRepository extends JpaRepository<Vendas, Long>{
	
	@Query("SELECT obj FROM Vendas obj WHERE obj.date BETWEEN :min AND :max ORDER BY obj.amount DESC")
	Page<Vendas> buscaVendas(LocalDate min, LocalDate max, Pageable pageable);
	
	

}
