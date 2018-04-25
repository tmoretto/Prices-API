package br.com.prices.prices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.prices.prices.model.PrecoProduto;

public interface PrecoProdutoRepository extends JpaRepository<PrecoProduto, Long> {

}
