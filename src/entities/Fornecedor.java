package entities;

import java.util.ArrayList;
import java.util.List;

public class Fornecedor {
	private String nome;
	private Integer cep;
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCep() {
		return cep;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	}

	public Fornecedor(String nome, Integer cep) {
		super();
		this.nome = nome;
		this.cep = cep;
	}
	

	
	
}
