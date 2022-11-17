package com.devwan.dsmeta.services;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.devwan.dsmeta.entities.Vendas;
import com.devwan.dsmeta.repositories.VendasRepository;

@Service
public class VendasService {
	
	@Autowired
	private VendasRepository repository;
	
	public Page<Vendas> buscaVendas(String minDate, String maxDate, Pageable pageable) {
		
		LocalDate today = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());
		LocalDate firstDayOfMonth = LocalDate.now().withDayOfMonth(1);
		
		
		LocalDate min = minDate.equals("") ? firstDayOfMonth : LocalDate.parse(minDate);
		LocalDate max = maxDate.equals("") ? today : LocalDate.parse(maxDate);
		
		return repository.buscaVendas(min, max, pageable);
	}

}
