package ListaAtividades5;

import java.util.Scanner;

public class Atividade6 {
	/* Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero = 0, soma = 0, media = 0, x = 0;
		
		do {
			System.out.println("Digite um numero: ");
			numero = leia.nextInt();
			
			if (numero % 3 == 0) {
				soma += numero;
				x++;
			}
			
		} while (numero != 0);
		
		media = soma / x;
		System.out.println("A m�dia dos multiplos de 3 �: " + media);

	} 

}
