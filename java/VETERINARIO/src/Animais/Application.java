package Animais;

public class Application {
	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro("Spike", 4);
		Cavalo cavalo = new Cavalo("Zion", 8);
		Preguica preguica = new Preguica("Mongo", 5);
		Animal gato = new Animal("Fera", 2);
		
		cachorro.estado();
		System.out.println();
		cavalo.estado();
		System.out.println();
		preguica.estado();
		System.out.println();
		gato.estado();
		System.out.println();
		
		System.out.println("Testes do Som:");
		
		cachorro.emitirSom();
		System.out.println();
		
		cavalo.emitirSom();
		System.out.println();
		
		preguica.emitirSom();
		System.out.println();
		
		gato.emitirSom();
		System.out.println();
		
		System.out.println("Testes de ações específicas:");
		
		cachorro.correr();
		System.out.println();
		
		cavalo.correr();
		System.out.println();
		
		preguica.subirArvore();
		System.out.println();
		
	}
}