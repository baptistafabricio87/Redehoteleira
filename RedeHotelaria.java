package hotelChain;

public class RedeHotelaria {
	
	protected String nomeUnidade;
	protected int idUnidade;
	protected int qtdFuncionarios;
		
	public RedeHotelaria() {
	}

	public RedeHotelaria(String nomeUnidade, int idUnidade, int qtdFuncionarios) {
		this.nomeUnidade = nomeUnidade;
		this.idUnidade = idUnidade;
		this.qtdFuncionarios = qtdFuncionarios;
	}

	public String getNomeUnidade() {
		return nomeUnidade;
	}

	public void setNomeUnidade(String nomeUnidade) {
		this.nomeUnidade = nomeUnidade;
	}

	public int getIdUnidade() {
		return idUnidade;
	}

	public void setIdUnidade(int idUnidade) {
		this.idUnidade = idUnidade;
	}

	public int getQtdFuncionarios() {
		return qtdFuncionarios;
	}

	public void setQtdFuncionarios(int qtdFuncionarios) {
		this.qtdFuncionarios = qtdFuncionarios;
	}

	public String toString(){
		return String.format("Rede Hoteleira %n------------------------ "
				+ "%nID Unidade: %s, %nNome: %s, %nQtd. Funcionarios: %s", 
				nomeUnidade, idUnidade, qtdFuncionarios);
	}
	
}
