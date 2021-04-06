package ListaAtividades4;

import java.util.Scanner;

public class AtividadeDesafio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("Por favor, insira um número inteiro qualquer para A:");
		a = leia.nextInt();
		System.out.println("Por favor, insira mais um número inteiro qualquer para B: ");
		b = leia.nextInt();
		
		c = a;
		a = b;
		b = c;
			
		System.out.println("O número de A: "+ a);
			System.out.println("O número de B: "+ b);
			
			
		}
		
	}


