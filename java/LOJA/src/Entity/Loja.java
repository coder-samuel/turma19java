package Entity;

public class Loja {
	private String nome;
	private String cnpj;
	private int unidade;
	
	public Loja(String nome, String cnpj, int unidade) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.unidade = unidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public int getUnidade() {
		return unidade;
	}

	public void setUnidade(int unidade) {
		this.unidade = unidade;
	}
	
	
	
	

}
