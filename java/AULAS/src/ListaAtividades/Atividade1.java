package ListaAtividades;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double P, E, M;

		System.out.println("Informe o peso total dos tomates: ");
		P = leia.nextDouble();
		E = (P - 50);

		if (E > 0) {
			M = E * 4.00;
			System.out.printf("Jo�o, voc� pagar� uma multa no valor de: R$ %.2f", M);
		} else {
			System.out.print("Jo�o, voc� n�o excedeu o peso m�ximo, sua multa �: ZERO!");
		}

	}

}
