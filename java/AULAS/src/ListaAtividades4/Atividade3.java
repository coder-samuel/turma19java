package ListaAtividades4;

import java.util.Scanner;


public class Atividade3 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int idade, infantil = 0, juvenil = 0, adultos = 0;

		System.out.println("Por favor, me informe sua idade: ");
		idade = leia.nextInt();

		if (idade >= 10 && idade <= 14) {
			System.out.println("Voc� � da categoria infantil! ");

		} else if (idade >= 15 && idade <= 17) {
			System.out.println("Voc� � da categoria juvenil!  ");
		} else if (idade >= 18 && idade <= 25) {
			System.out.println("Voc� � da categoria adulto!");
		} else {
			System.out.println("Voc� n�o entra em nenhuma das categorias. ");
		}
	}
} 