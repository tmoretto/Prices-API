package br.com.prices.prices.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Produto")
public class Produto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@NotNull
	@Column(name = "codigo_barras")
    private String codigoBarras;
	
	private String nome;

	public Produto() {
	}
	
	public Produto(String codigoBarras, String nome) {
		super();
		this.codigoBarras = codigoBarras;
		this.codigoBarras = nome;
	}

	public Produto(String codigoBarras) {
		super();
		this.codigoBarras = codigoBarras;
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

}
