package Animais;

public class Cavalo extends Animal{

	//M�todos
	@Override
	public void estado() {
		System.out.println("----- CAVALO -----");
		super.estado();
	}
	
	public void correr() {
		System.out.println("Correndo como um cavalo");
	}
	
	public void emitirSom() {
		System.out.println("hiin in in hinir");
	}
	
	//Construtor
	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}
}