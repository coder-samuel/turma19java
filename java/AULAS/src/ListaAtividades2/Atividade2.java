package ListaAtividades2;

import java.util.Scanner;

public class Atividade2 {
	/*
	 * Desenvolver um sistema que efetue a soma de todos os n�meros �mpares que s�o
	 * m�ltiplos de tr�s e que se encontram no conjunto dos n�meros de 1 at� 500.
	 */

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int soma = 0;
		int multiplos;

		System.out.println("Os n�meros multilplos de 3 e �mpares da contagem de 1 a 500: ");
		for (multiplos = 1; multiplos <= 500; multiplos++) {
			if (multiplos % 3 == 0) {
				if (multiplos % 2 != 0) {
					soma = multiplos + soma;

					System.out.println(multiplos);
				}
			}
		}
		System.out.println("\nA soma dos n�meros multiplos de 3 e �mpares �:"+ soma);

	}

}
