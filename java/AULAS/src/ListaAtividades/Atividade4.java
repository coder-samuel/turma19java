package ListaAtividades;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero;

		System.out.println("Digite um número inteiro:");
		numero = leia.nextInt();

		if (numero == 0) {
			System.out.println("O número %d é neutro");
		} else if (numero < 0 && (numero % 2) == 0) {
			System.out.println("O número é negativo e par");
		} else if (numero < 0 && (numero % 2) != 1) {
			System.out.println("O número é negativo e ímpar");
		} else if ((numero % 2) == 0) {
			System.out.println("O número é positivo e par");
		} else {

			System.out.println("O número é positivo e ímpar");
		}
	}

}
