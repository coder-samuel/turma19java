package ListaAtividades;

import java.util.Scanner;

public class Atividade7 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		double b, h, area;

		System.out.println("Digite a base do tri�ngulo: ");
		b = leia.nextDouble();

		System.out.println("Digite a altura do tri�ngulo:  ");
		h = leia.nextDouble();
		area = (b * h) / 2;

		if (b >= 1 && h >= 1) {
			System.out.println("A �rea do tri�ngulo � igual a:  "+ area);
		} else {
			System.out.println("N�o foi possivel calcular as �reas");

		}
		{

		}

	}
}