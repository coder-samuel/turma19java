package Entity;

public class Doces extends Produto {

	private String fabricantes;

	public Doces(String descricao, String codigo, double valorUnitario, String fabricantes) {
		super(descricao, codigo, valorUnitario);
		this.fabricantes = fabricantes;
	}

	public String getFabricantes() {
		return fabricantes;
	}

	public void setFabricantes(String fabricantes) {
		this.fabricantes = fabricantes;
	}
	
	
}
