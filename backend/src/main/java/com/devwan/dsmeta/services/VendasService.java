package com.devwan.dsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devwan.dsmeta.entities.Vendas;
import com.devwan.dsmeta.repositories.VendasRepository;

@Service
public class VendasService {
	
	@Autowired
	private VendasRepository repository;
	
	public List<Vendas> buscaVendas() {
		return repository.findAll();
	}

}
