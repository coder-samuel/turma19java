package ListaAtividades5;

import java.util.Locale;
import java.util.Scanner;

public class Aula1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		final int HABITANTES = 20;
				double salario = 0.00;
				int numFilhos = 0;
				double mediaSalarios;
				double totalSalarios = 0.00;
				double mediaNumeroFilhos = 0.00;
				int totalNumeroFilhos = 0;
				double maiorSalario = 0.00;
				double percentualPessoasAte100 = 0.00;

			for (int x =1; x <= HABITANTES; x++){

			System.out.print("Informe o salário do habitante: ");
			salario = leia.nextDouble();
			System.out.print("Informe o numero de filhos do habitantes: ");
			numFilhos =leia.nextInt();
			totalSalarios= totalSalarios + salario;
			totalNumeroFilhos = totalNumeroFilhos + numFilhos; 

			if (maiorSalario < salario)
			{
				maiorSalario = salario;
				}
			}
			mediaSalarios = totalSalarios / HABITANTES; 

			System.out.printf("\nTotal de salários:", totalSalarios);
			System.out.printf("\nTotal de Filhos:", totalNumeroFilhos);
			System.out.printf("\nMédia salarial:", mediaSalarios);
			System.out.printf("\nMaior salário:", maiorSalario);
	}

}
