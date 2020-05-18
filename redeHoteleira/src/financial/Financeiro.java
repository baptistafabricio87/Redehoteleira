package financial;

import hotelChain.RedeHotelaria;

public class Financeiro extends RedeHotelaria {
	
	private double salario;
	protected double diaria = 120.00;
	
	public Financeiro(double salario, double diaria) {
		super();
		this.salario = salario;
		this.diaria = diaria;
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

	public double getDiaria() {
		return diaria;
	}
	
}