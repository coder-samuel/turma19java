package Exemplo;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int x1, x2,y1, y2; 
		int x3, y3, d;
		
		System.out.println("Declare o valor de x1:");
		x1 = leia.nextInt();
		System.out.println("Declare o valor de x2:");
		x2 = leia.nextInt();
		System.out.println("Declare o valor de y1:");
		y1 = leia.nextInt();
		System.out.println("Declare o valor de y2:");
		y2 = leia.nextInt();
		
		x3 = (int) Math.pow(x2-x1, 2);
		y3 = (int) Math.pow(y2-y1, 2);
		d = (int)  Math.sqrt(x3+y3);
		
		System.out.printf("A distância entre os pontos X e Y é: %d ", d);


	}

}
