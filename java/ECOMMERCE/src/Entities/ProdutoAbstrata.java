package Entities;

public class ProdutoAbstrata {
	  private  String descricao;
	  private  String codigo;
	  private double valorUnitario;
	  private int  qtdeEstoque;
	  
	public ProdutoAbstrata(String descricao, String codigo, double valorUnitario) {
		super();
		this.descricao = descricao;
		this.codigo = codigo;
		this.valorUnitario = valorUnitario;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCodigo() {
		return codigo;
	}
/*
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
*/
	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public int getQtdeEstoque() {
		return qtdeEstoque;
	}

	public void setQtdeEstoque(int qtdeEstoque) {
		this.qtdeEstoque = qtdeEstoque;
	}
	
	public void incluirEstoque (int valorIncluido) {
		qtdeEstoque = qtdeEstoque + valorIncluido;
		
	}
	public void tirarEstoque (int valorExcluido) {
		qtdeEstoque = qtdeEstoque - valorExcluido;
		
	} 

	
	  
}
