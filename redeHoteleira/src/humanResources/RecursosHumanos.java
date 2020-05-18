package humanResources;

import financial.Financeiro;

public class RecursosHumanos extends Financeiro {
	
	protected String depto;
	protected int dataAdmissao;

	public RecursosHumanos(String depto, int dataAdmissao) {
		super();
		this.depto = depto;
		this.dataAdmissao = dataAdmissao;
	}

	public RecursosHumanos() {
		super();
	}

	public String getDepto() {
		return depto;
	}

	public void setDepto(String depto) {
		this.depto = depto;
	}

	public int getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(int dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public String toString() {
		return String.format("Recursos Humanos: %nData de Admissão:%s %nDepartamento:%s", dataAdmissao, depto);
	}
}
