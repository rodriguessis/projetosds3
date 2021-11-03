package br.com.projecta.devvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.projecta.devvendas.dto.SellerDTO;
import br.com.projecta.devvendas.service.SellerService;

@RestController
@RequestMapping( value = "/sellers" )
public class SellerController {
	
	@Autowired
	private SellerService service;
	
	@GetMapping
	public ResponseEntity<List<SellerDTO>> findAll() {
		List<SellerDTO> lista = service.findAll();
		return ResponseEntity.ok(lista);
	}
	
}
