package br.com.projecta.devvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projecta.devvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
