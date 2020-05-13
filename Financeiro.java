package financial;

import hotelChain.RedeHotelaria;

public class Financeiro extends RedeHotelaria {
	
	private double salario;

	public Financeiro(String nomeUnidade, int idUnidade, int qtdFuncionarios, double salario) {
		super(nomeUnidade, idUnidade, qtdFuncionarios);
		this.salario = salario;
	}

	public Financeiro() {
		super();
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}