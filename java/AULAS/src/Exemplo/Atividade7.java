package Exemplo;

import java.util.Scanner;

public class Atividade7 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int a, b, c, d, e, f;
		int x, y;
		
		
		System.out.println("Informe o valor correspondente de a:");
		a = leia.nextInt();
		System.out.println("Informe o valor correspondente de b:");
		b = leia.nextInt();
		System.out.println("Informe o valor correspondente de c:");
		c = leia.nextInt();
		System.out.println("Informe o valor correspondente de d:");
		d = leia.nextInt();
		System.out.println("Informe o valor correspondente de e:");
		e = leia.nextInt();
		System.out.println("Informe o valor correspondente de f:");
		f = leia.nextInt();
		
		x = ((c * e) - (b * f)) / ((a * e) - (b * d));
		
		y = ((a*f) - (c*d)) / ((a*e) - (b*d)); 
		
		
	
		System.out.printf("O valor correspondente de x é: %d", x);
		System.out.printf("\nO valor correspondente de y é: %d", y);
		
		
		
		
	}

}
