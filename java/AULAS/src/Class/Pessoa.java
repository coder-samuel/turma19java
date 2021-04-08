package Class;

public class Pessoa {

	public String nome;
	public int anoNascimento;
	public char genero;
		/*
		 
		 */
	public int calcularIdade() {
		return 2021 - anoNascimento;
	}
	public int calcularIdade(int anoAtual) {
		return anoAtual - anoNascimento;
}
}