package entities;

import java.util.ArrayList;
import java.util.List;

import entities.Produtos;


public class Vendas {
	private Integer codigo_produto;
	private Integer quant_prod;
	
	public Integer getCodigo_produto() {
		return codigo_produto;
	}
	public void setCodigo_produto(Integer codigo_produto) {
		this.codigo_produto = codigo_produto;
	}
	public Integer getQuant_prod() {
		return quant_prod;
	}
	public void setQuant_prod(Integer quant_prod) {
		this.quant_prod = quant_prod;
	}

	public Vendas(Integer codigo_produto, Integer quant_prod) {
		super();
		this.codigo_produto = codigo_produto;
		this.quant_prod = quant_prod;
	}
	
}
