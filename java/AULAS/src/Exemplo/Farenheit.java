package Exemplo;

import java.util.Scanner;

public class Farenheit {

	public static void main(String[] args) {
		
		double celsius;
		double fahrenheit;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite a temperatura em Graus celsius: ");
		celsius = leia.nextDouble();
		fahrenheit = ((celsius * 1.8) + 32);
		
		
		System.out.println("A temperatura em graus celsius é: "+celsius);
		System.out.printf("A temperatura em fahrenheit é: %.2f",fahrenheit);
	}

}
