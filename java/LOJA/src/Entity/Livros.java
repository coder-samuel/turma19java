package Entity;

public class Livros extends Produto {
	private String genero;
	private String autore;
	private String editora;
	private int numeroPagina;

	public Livros(String descricao, String codigo, double valorUnitario, String genero, String autore, String editora,
			int numeroPagina) {
		super(descricao, codigo, valorUnitario);
		this.genero = genero;
		this.autore = autore;
		this.editora = editora;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
		if(genero == "1") {
			genero = "Autobiografia";
		} else if(genero == "2") {
			genero = "HQ's";
		}else if(genero == "3") {
			genero = "Fantasia";
		}else if(genero == "4") {
			genero = "Didático";
		}if(genero == "5") {
			genero = "Clássicos Brasileiros";
		}if(genero == "6") {
			genero = "Clássicos Mundiais";
		} else {
			System.out.println("Por favor, selecione apenas as opções acima.");
		}
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public int getNumeroPagina() {
		return numeroPagina;
	}

	public void setNumeroPagina(int numeroPagina) {
		this.numeroPagina = numeroPagina;

	}

	public void genero() {
		  if (this.genero == "1") {
			System.out.println("O gênero literário da obra escolhida é:" + getGenero());
		} else if (genero == "2") {
			System.out.println("O gênero literário da obra escolhida é:" + getGenero());
		} else if (genero == "3") {
			System.out.println("O gênero literário da obra escolhida é:" + getGenero());
		} else if (genero == "5") {
			System.out.println("O gênero literário da obra escolhida é:" + getGenero());
		} else if (genero == "6") {
			System.out.println("O gênero literário da obra escolhida é:" + getGenero());
		} else if (genero == "7") {
			System.out.println("O gênero literário da obra escolhida é:" + getGenero());
		} else {
			System.out.println("O gênero literário da obra escolhida é:" + getGenero());
		}

	}

}
