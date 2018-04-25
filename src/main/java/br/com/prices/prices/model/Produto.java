package br.com.prices.prices.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "Produto")
public class Produto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@NotNull
	@Column(name = "codigo_barras")
    private String codigoBarras;
	
	@OneToMany(mappedBy = "produto", cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonManagedReference
	private List<PrecoProduto> precos = new ArrayList<>();

	private String nome;

	public Produto() {
	}
	
	public Produto(String codigoBarras, String nome) {
		super();
		this.codigoBarras = codigoBarras;
		this.codigoBarras = nome;
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<PrecoProduto> getPrecos() {
		return precos;
	}

	public void setPrecos(List<PrecoProduto> precos) {
		this.precos = precos;
	}
	
}
