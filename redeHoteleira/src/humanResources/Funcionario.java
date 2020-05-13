package humanResources;

public class Funcionario extends RecursosHumanos{

	// Nome do funcionario
	protected String nome;
	// Registro do funcionario
	protected String registro;
	
	public Funcionario() {
		super();
	}

	public Funcionario(String nomeUnidade, int idUnidade, int qtdFuncionarios, double salario, String depto,
			int dataAdmissao, String nome, String registro) {
		super(nomeUnidade, idUnidade, qtdFuncionarios, salario, depto, dataAdmissao);
		this.nome = nome;
		this.registro = registro;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getRegistro() {
		return registro;
	}
	
	public void setRegistro(String registro) {
		this.registro = registro;
	}
}
