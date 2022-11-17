package com.devwan.dsmeta.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devwan.dsmeta.entities.Vendas;
import com.devwan.dsmeta.services.VendasService;

@RestController
@RequestMapping(value = "/vendas")
public class VendasController {
	
	@Autowired
	private VendasService service;
	
	@GetMapping
	public Page<Vendas> buscaVendas(
			@RequestParam(value = "minDate", defaultValue = "") String minDate, 
			@RequestParam(value = "maxDate", defaultValue = "") String maxDate,
			Pageable pageable) {
		return service.buscaVendas(minDate, maxDate, pageable);
		
	}

}
