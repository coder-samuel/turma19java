package ListaAtividades;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero;

		System.out.println("Digite um n�mero inteiro:");
		numero = leia.nextInt();

		if (numero == 0) {
			System.out.println("O n�mero %d � neutro");
		} else if (numero < 0 && (numero % 2) == 0) {
			System.out.println("O n�mero � negativo e par");
		} else if (numero < 0 && (numero % 2) != 1) {
			System.out.println("O n�mero � negativo e �mpar");
		} else if ((numero % 2) == 0) {
			System.out.println("O n�mero � positivo e par");
		} else {

			System.out.println("O n�mero � positivo e �mpar");
		}
	}

}
