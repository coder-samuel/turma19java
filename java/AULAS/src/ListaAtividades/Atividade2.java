package ListaAtividades;

import java.util.Scanner;

public class Atividade2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int codigo, horaTrabalho;
		double salario, salarioExtra, extras, excesso;

		System.out.println("Informe o c�digo de usu�rio: ");
		codigo = leia.nextInt();
		System.out.println("Informe a quantidade de horas trabalhadas: ");
		horaTrabalho = leia.nextInt();
		salario = (horaTrabalho * 10.00);
		if (horaTrabalho <= 50) {
			System.out.printf("O sal�rio do colaborador %d � de: R$ %.2f", codigo, salario);
		} else if (horaTrabalho > 50) {
			salario = (horaTrabalho * 10.00);
			extras = horaTrabalho - 50;
			excesso = (extras * 20.00);
			salarioExtra = salario + excesso;
			System.out.printf(
					"O sal�rio do colaborador %d � de R$ %.2f\nE abono de horas excedentes � de R$ %.2f\nO sal�rio total � de R$ %.2f",
					codigo, salario, excesso, salarioExtra);
		}

	}

}
