package entities;

import java.util.List;
import java.util.ArrayList;

public class Produtos {
	private String nome;
	private Double valor_de_venda;
	private Integer estoque;
	
	public String getNome() {
		return nome;
	}
	
	public Produtos(String nome, Double valor_de_venda, Integer estoque) {
		super();
		this.nome = nome;
		this.valor_de_venda = valor_de_venda;
		this.estoque = estoque;
	}


	public Double getValor_de_venda() {
		return valor_de_venda;
	}

	public void setValor_de_venda(Double valor_de_venda) {
		this.valor_de_venda = valor_de_venda;
	}

	public Integer getEstoque() {
		return estoque;
	}

	public void setEstoque(Integer estoque) {
		this.estoque = estoque;
	}	
	
}
