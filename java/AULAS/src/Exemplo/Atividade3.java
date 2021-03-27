package Exemplo;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int nota1, nota2, nota3;
		int mediaPonderada;
		
		System.out.println("Digite o valor da 1ª nota: ");
		nota1 = leia.nextInt();
		System.out.println("Digite o valor da 2ª nota: ");
		nota2 = leia.nextInt();
		System.out.println("Digite o valor da 3ª nota: ");
		nota3 = leia.nextInt();
		
		mediaPonderada = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5))/(2+3+5);
		System.out.printf("A média ponderada é: %d", mediaPonderada);
		
	}

}
