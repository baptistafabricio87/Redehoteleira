package humanResources;

import java.util.Scanner;

public class Mensageiro extends Funcionario{
	
	// R$ 150,00 Aqui é o quanto a empresa paga por hora para um gerente
    protected double valor = 100;
    // metodo calculaGratificacao, define valor da gratificacao do funcionario.
    protected double gratificacao = 0.05;
    // Define horas trabalhadas.
    protected double horas;
    // Define valor do salario calculado a ser passado para classe financeiro
    protected double salarioCalculado;
    
	Scanner sc = new Scanner(System.in);

	public Mensageiro() {
		super();
	}

	public double getValor() {
		return valor;
	}

	public double getGratificacao() {
		return gratificacao;
	}

	public double getHoras() {
		return horas;
	}

	public void setHoras(double horas) {
		this.horas = horas;
	}
	
	public void calculaSalario() {
		salarioCalculado = (valor * horas) * gratificacao;
    	super.setSalario(salarioCalculado);
    }
	
	public void cadastraMensageiro() {
		System.out.println("Nome do Funcionario: ");
		setNome(sc.nextLine());
		System.out.println("Numero de Registro:");
		setRegistro(sc.nextLine());
		System.out.println("Data de Admissão:(somente numeros)");
		setDataAdmissao(sc.nextInt());
		System.out.println("Nome da Unidade: ");
		sc.nextLine();
		setNomeUnidade(sc.nextLine());
		System.out.println("ID da Unidade: ");	
		setIdUnidade(sc.nextInt());
		System.out.println("Departamento: ");
		sc.nextLine();
		setDepto(sc.nextLine());
		System.out.println("Mensageiro Cadastrado com Sucesso!");
	}
	
	public String toString() {
		return String.format("%n-------------------------------"
				+ "%nNome do Funcionario: %s"
				+ "%nNº Registro:         %s"
				+ "%nData de Admissão:    %s"
				+ "%nNome da Unidade:     %s"
				+ "%nID da Unidade:       %s"
				+ "%nDepartamento:        %s"
				+ "%nSalario:             %s"
				+ "%nGratificação:        %s"
				+ "%nHoras Trabalhadas:   %s",
				nome, registro, dataAdmissao, nomeUnidade, idUnidade,
				depto, salarioCalculado, gratificacao, horas);
	}
}