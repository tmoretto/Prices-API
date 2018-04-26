package br.com.prices.prices.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "Fornecedor")
public class Fornecedor implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@NotNull
    private String cnpj;
	
	@NotNull
    private String nome;
	
	@OneToMany(mappedBy = "fornecedor", cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonManagedReference
	private List<PrecoProduto> precos = new ArrayList<>();
	
	public Fornecedor() {
	}
	
	public Fornecedor(String cnpj, String nome) {
		super();
		this.cnpj = cnpj;
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
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
