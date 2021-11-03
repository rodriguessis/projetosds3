package br.com.projecta.devvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projecta.devvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
