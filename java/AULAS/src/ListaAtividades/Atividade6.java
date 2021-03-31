
package ListaAtividades;

import java.util.Scanner;

public class Atividade6 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int idade, infantilA = 0, infantilB = 0, juvenilA = 0, juvenilB = 0, adultos = 0;

		System.out.println("Por favor, me informe sua idade: ");
		idade = leia.nextInt();

		if (idade >= 5 && idade <= 7) {
			System.out.println("Você é da categoria infantil A  ");

		} else if (idade >= 8 && idade <= 11) {
			System.out.println("Você é da categoria infantil B  ");
		} else if (idade >= 12 && idade <= 13) {
			System.out.println("Você é da categoria juvenil A  ");
		} else if (idade >= 14 && idade <= 17) {
			System.out.println("Você é da categoria juvenil B ");
		} else if (idade >= 18) {
			System.out.println("Você é da categoria adulto  ");
		} else {
			System.out.println("Você não entra em nenhuma das categorias. ");
		}
	}
}