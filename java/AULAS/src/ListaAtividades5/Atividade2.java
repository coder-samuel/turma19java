package ListaAtividades5;

import java.util.Scanner;

public class Atividade2 {
	/* Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR) */

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int numero = 0, numeroPar = 0, numeroImpar = 0;

		for (int x = 0; x < 3; x++) {
			System.out.println("Digite um numero ? ");
			numero = leia.nextInt();

			if (numero % 2 == 0 && numero != 0) {
				numero = numeroPar++;

			} else if (numero % 2 >= 1) {
				numero = numeroImpar++;

			} 

		}
		System.out.println("Dos numeros digitados s�o pares " + numeroPar);
		System.out.println("Dos numeros digitados s�o impares " + numeroImpar);

	}

}
