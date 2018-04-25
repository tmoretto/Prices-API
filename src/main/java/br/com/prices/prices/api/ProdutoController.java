package br.com.prices.prices.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.prices.prices.model.Produto;
import br.com.prices.prices.repository.ProdutoRepository;

@RestController
@RequestMapping("/api/precos")
public class ProdutoController {

	@Autowired
	private ProdutoRepository repository;

	@GetMapping
	public ResponseEntity<List<Produto>> obterTodos() {
		List<Produto> precosProdutos = repository.findAll(); 
		if (precosProdutos.isEmpty()) {
			return new ResponseEntity<List<Produto>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Produto>>(precosProdutos, HttpStatus.OK);
	}

}


