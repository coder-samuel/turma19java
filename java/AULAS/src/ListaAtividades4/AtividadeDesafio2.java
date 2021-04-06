package ListaAtividades4;

import java.util.Scanner;
/*IR
1500 ISENTO/ISENTE/ISENTA
1500 ATÉ 2500 PAGA 15%
ACIMEA DE 2500 PAGA 25%
15 MIN
*/

public class AtividadeDesafio2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double salario;
		String nome; 
		
		System.out.println("Para calcular o IR, informe-nos o seu salário bruto:");
		salario = leia.nextInt();
		
		if (salario <= 1500.00) {
			salario = salario * 0;
			System.out.println("Você está insente do Imposto de renda!" );
		} else if (salario > 1500.00 && salario <= 2500.00) {
			salario = salario * 0.15;
			System.out.printf("O valor do IR a ser pago é de R$ %.2f",salario);	
		} else if (salario > 2500.00) {
			salario = salario * 0.25;
			System.out.printf("O valor do IR a ser pago é de R$ %.2f", salario);	
		}

	}

}
