package application;

import java.util.Locale;
import java.util.Scanner;

import financial.Reserva;
import humanResources.Gerente;
import humanResources.Mensageiro;
import warehouse.Estoque;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Mensageiro mensageiro = new Mensageiro();
		Gerente gerente = new Gerente();
		Reserva reserva = new Reserva();
		Estoque estoque = new Estoque();

		System.out.println("Digite a opção desejada: ");
		System.out.println("1 - Cadastrar Funcionarios |2 - Calcula Salarios |"
				+ "3 - Reservar Quarto |4 - Cadastra Item |"
				+ "5 - Mostra Unidades");
		int opt = sc.nextInt();

		switch(opt) {

		case 1:
			System.out.println("------------------------------");
			System.out.println("Cadastro Gerente: ");
			gerente.cadastraGerente();
			System.out.println("------------------------------");
			System.out.println("Cadastro Mensageiro:");
			mensageiro.cadastraMensageiro();
			break;

		case 2:
			System.out.println("------------------------------");
			System.out.println("Digitar horas trabalhadas Gerente: ");
			gerente.setHoras(sc.nextInt());
			gerente.calculaSalario();
			System.out.println("------------------------------");
			System.out.println("Digitar horas trabalhadas Mensageiro");
			mensageiro.setHoras(sc.nextInt());
			mensageiro.calculaSalario();
			System.out.println(gerente.toString());
			System.out.println(mensageiro.toString());
			break;

		case 3:
			System.out.println("------------------------------");
			System.out.println("Reserva de Quartos:");
			reserva.reservas();
			break;

		case 4:
			estoque.cadProduto();
			break;

		case 5: 

			break;

		default: //Sair
			opt = 0;
			break;
		} // Fim do For
	sc.close();
	}// Fim do metodo main

} // Fim da Classe Program