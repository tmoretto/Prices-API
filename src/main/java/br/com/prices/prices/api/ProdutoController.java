package br.com.prices.prices.api;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.prices.prices.model.Produto;
import br.com.prices.prices.repository.ProdutoRepository;

@RestController
@RequestMapping("/api")
public class ProdutoController {

	@Autowired
	private ProdutoRepository repository;

	@CrossOrigin(origins = { "*" }, maxAge = 6000)
	@GetMapping
	public ResponseEntity<List<Produto>> obterTodos() {
		List<Produto> precosProdutos = repository.findAll(); 
		if (precosProdutos.isEmpty()) {
			return new ResponseEntity<List<Produto>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Produto>>(precosProdutos, HttpStatus.OK);
	}
	
	@CrossOrigin(origins = { "*" }, maxAge = 6000)
	@GetMapping("/{codigoBarras}")
	public ResponseEntity<List<Produto>> obterPorCodigoDeBarras(@PathVariable String codigoBarras) {
		Produto produto = repository.findOneProdutoByCodigoBarras(codigoBarras);
		if (produto == null) {
			return new ResponseEntity<List<Produto>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Produto>>(Arrays.asList(produto), HttpStatus.OK);
	}
}


