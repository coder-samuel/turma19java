package ListaAtividades2;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		double salario, ultimoSalario, mediaSalario = 0, somaSalario = 0, mediaFilhos = 0;
		int i, filhos, totalPopulacao, totaLfilhos = 0;

		for (i = 1; i <= 20; i++) {

			System.out.println("Informe o seu salário:");
			salario = leia.nextDouble();
			System.out.println("Informe quantos filhos você tem: ");
			filhos = leia.nextInt();
			somaSalario = salario + somaSalario;
			totaLfilhos = filhos + totaLfilhos;
			totalPopulacao = totaLfilhos + i;
			mediaSalario = somaSalario / totalPopulacao;
			mediaFilhos = totaLfilhos / i;
			ultimoSalario = salario;

		}
		System.out.println("A soma de todos os salários é: R$" + somaSalario);
		System.out.println("A média salarial é de: R$" + mediaSalario);
		System.out.println("A média de filhos na cidade é :" + mediaFilhos);
	}

}