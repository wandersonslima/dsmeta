package com.devwan.dsmeta.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devwan.dsmeta.entities.Vendas;
import com.devwan.dsmeta.services.VendasService;

@RestController
@RequestMapping(value = "/vendas")
public class VendasController {
	
	@Autowired
	private VendasService service;
	
	@GetMapping
	public List<Vendas> buscaVendas() {
		return service.buscaVendas();
		
	}

}
