package br.com.prices.prices.api;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.prices.prices.model.Fornecedor;
import br.com.prices.prices.repository.FornecedorRepository;

@RestController
@RequestMapping("/api/precos")
public class PrecosController {

	@Autowired
	private FornecedorRepository repository;

	@CrossOrigin(origins = { "*" }, maxAge = 6000)
	@GetMapping
	public ResponseEntity<List<Fornecedor>> obterTodos() {
		List<Fornecedor> fornecedores = repository.findAll();
		
		if (fornecedores.isEmpty()) {
			return new ResponseEntity<List<Fornecedor>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Fornecedor>>(fornecedores, HttpStatus.OK);
	}
	
	@CrossOrigin(origins = { "*" }, maxAge = 6000)
	@GetMapping("/{codigoBarras}")
	public ResponseEntity<List<Fornecedor>> obterPorCodigoDeBarras(@PathVariable String codigoBarras) {
		List<Fornecedor> fornecedores = repository.findFornecedorByPrecosProdutoCodigoBarras(codigoBarras);
		
		fornecedores.forEach(fornecedor -> {
			System.out.println(fornecedor.getPrecos().size());
			fornecedor.setPrecos(
					fornecedor.getPrecos().stream()
					.filter(p -> p.getProduto().getCodigoBarras().equals(codigoBarras))
					.collect(Collectors.toList())
			);
		});
		
		if (fornecedores.isEmpty()) {
			return new ResponseEntity<List<Fornecedor>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Fornecedor>>(fornecedores, HttpStatus.OK);
	}
}


