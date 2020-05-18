package humanResources;

public class Funcionario extends RecursosHumanos{

	// Nome do funcionario
	protected String nome;
	// Registro do funcionario
	protected String registro;
	
	public Funcionario(String nome, String registro) {
		super();
		this.nome = nome;
		this.registro = registro;
	}

	public Funcionario() {
		super();
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
