package ListaAtividades;

import java.util.Scanner;

public class Atividade8 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int n;
		System.out.println("  digite um numero  ");
		n = leia.nextInt();
      
		if (n <=100 ) {
			System.out.println("  seu valor � 0 ");
		}
		else { System.out.println("  seu valor � " + n );
			
		}
	}
    
}