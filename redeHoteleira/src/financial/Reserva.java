package financial;

import java.util.Scanner;

public class Reserva extends Financeiro{
	
	protected String nome;
	protected String email;
	protected int apto;
	protected int dias;
	
	public Reserva() {
		super();
	}

	public Reserva(String nome, String email, int apto, int dias) {
		super();
		this.nome = nome;
		this.email = email;
		this.apto = apto;
		this.dias = dias;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getApto() {
		return apto;
	}

	public void setApto(int apto) {
		this.apto = apto;
	}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

	public String toString() {
		return nome + ", " + email + ", " + apto + ", " + dias;
	}
	
	public void reservas() {		
		// Reserva --------------------------------------
		Scanner sc = new Scanner(System.in);
		Reserva[] vect = new Reserva[10];
		
		System.out.print("Quantos quartos serão locados? ");
		int n = sc.nextInt();
		sc.nextLine();
		 
		for (int i=0; i<n; i++) {
			int q = i + 1;
			System.out.println("Hospede #" + q +":");
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int room = sc.nextInt();
			sc.nextLine();
			System.out.println("Quantidade de diarias: ");
			int days = sc.nextInt();
			sc.nextLine();
			vect[i] = new Reserva(name, email, room, days);
		}
		System.out.println("----------------------------");
		System.out.println("Quarto Reservados: ");
		for (int i=0; i<vect.length; i++) {
			if(vect[i] != null) {
				int q = i + 1;
				System.out.println(q + ":" + vect[i]);
				double valor = vect[i].dias * diaria;
				System.out.println("Valor da reserva: " + valor); 
			}
		}
		sc.close();
	}	
}