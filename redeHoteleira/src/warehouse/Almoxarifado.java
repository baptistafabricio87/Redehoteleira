package warehouse;

import financial.Financeiro;

public class Almoxarifado extends Financeiro {
	
	protected String categoria;
	protected double preco;
	protected int quantidade;
	
	public Almoxarifado(String categoria, double preco, int quantidade) {
		super();
		this.categoria = categoria;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public Almoxarifado() {
		super();
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
	
	

}
