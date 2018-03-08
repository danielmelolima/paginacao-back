package br.com.danielmelolima.paginacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.danielmelolima.paginacao.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

	
}