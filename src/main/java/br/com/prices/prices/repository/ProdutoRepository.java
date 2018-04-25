package br.com.prices.prices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.prices.prices.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, String> {
	
	Produto findOneProdutoByCodigoBarras(String codigoBarras);
}
