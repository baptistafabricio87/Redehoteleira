package financial;

import java.util.Scanner;

public class Reserva extends Financeiro{
	
	protected String nome;
	protected String email;
	protected int apto;
	
	public Reserva() {
		super();
	}

	public Reserva(String nome, String email, int apto) {
		super();
		this.nome = nome;
		this.email = email;
		this.apto = apto;
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

	public String toString() {
		return nome + ", " + email + ", " + apto;
	}
	
	public void reservas() {		
		// Reserva --------------------------------------
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos quartos serão locados? ");
		int n = sc.nextInt();
		Reserva[] vect = new Reserva[n];
		int h=1;

		for (int i=0; i<n; i++) {
			System.out.println("Hospede #" + h++ +":");
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int room = sc.nextInt();
			sc.nextLine();
			vect[i] = new Reserva(name, email, room);
		}
		System.out.println("----------------------------");
		sc.nextLine();
		System.out.println("Quarto locados: ");
		for (int i=0; i<vect.length; i++) {
			if(vect[i] != null) {
				System.out.println(i + ":" + vect[i]);
			}
		}
		sc.close();
	}	
}