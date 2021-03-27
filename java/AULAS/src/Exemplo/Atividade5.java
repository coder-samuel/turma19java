package Exemplo;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int A, B, C;
		int D, R, S;
		
		System.out.println("Digite o valor de A: ");
		A = leia.nextInt();
		System.out.println("Digite o valor de B: ");
		B = leia.nextInt();
		System.out.println("Digite o valor de C: ");
		C = leia.nextInt();
		
		R = (int) Math.pow(A+B,2);
		S = (int) Math.pow(B+C,2);
		D = (R + S) / 2;
		
		System.out.printf("O valor de R é: %d \nO valor de S é: %d \nO valor de d é : %d ", R, S, D);
	}

}
