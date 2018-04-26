package br.com.prices.prices.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.prices.prices.model.Fornecedor;

public interface FornecedorRepository extends JpaRepository<Fornecedor, String> {

	List<Fornecedor> findFornecedorByPrecosProdutoCodigoBarras(String codigoBarras);
	
}
