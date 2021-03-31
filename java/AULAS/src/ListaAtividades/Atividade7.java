package ListaAtividades;

import java.util.Scanner;

public class Atividade7 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		double b, h, area;

		System.out.println("Digite a base do triângulo: ");
		b = leia.nextDouble();

		System.out.println("Digite a altura do triângulo:  ");
		h = leia.nextDouble();
		area = (b * h) / 2;

		if (b >= 1 && h >= 1) {
			System.out.println("A área do triângulo é igual a:  "+ area);
		} else {
			System.out.println("Não foi possivel calcular as áreas");

		}
		{

		}

	}
}