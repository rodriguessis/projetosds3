package br.com.projecta.devvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projecta.devvendas.dto.SaleDTO;
import br.com.projecta.devvendas.dto.SaleSuccessDTO;
import br.com.projecta.devvendas.dto.SaleSumDTO;
import br.com.projecta.devvendas.service.SaleService;

@RestController
@RequestMapping( value = "/sales" )
public class SaleController {
	
	@Autowired
	private SaleService service;
	
	@GetMapping
	public ResponseEntity<Page<SaleDTO>> findAll( Pageable pageable ) {
		Page<SaleDTO> lista = service.findAll( pageable );
		return ResponseEntity.ok(lista);
	}
	
	@GetMapping("/amount-by-seller")
	public ResponseEntity<List<SaleSumDTO>> amountGroupedBySeller( ) {
		List<SaleSumDTO> lista = service.amountGroupedBySeller();
		return ResponseEntity.ok(lista);
	}
	
	@GetMapping("/success-by-seller")
	public ResponseEntity<List<SaleSuccessDTO>> sucessGroupedBySeller( ) {
		List<SaleSuccessDTO> lista = service.successGroupedBySeller();
		return ResponseEntity.ok(lista);
	}
	
}
