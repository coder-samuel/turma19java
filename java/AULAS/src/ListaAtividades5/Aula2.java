package ListaAtividades5;

import java.util.Scanner;

public class Aula2 {

	public static void main(String[] args) {
		// Arrays = Vetor e Matriz
		/*// 4 pessoas - nome - vetor
		// 4 nota [inteiro entre 1-10] - vetor
		// nome - nota - ate 5 > ainda não/acima de de 5 > muito bem*/
		Scanner leia = new Scanner(System.in);
		String nomes[] = new String[4];
		int nota[] = new int[4];
		
		for (int x = 0; x <nomes.length; x ++) {
		System.out.println("Por favor, insira o seu nome:");
		nomes[x] = leia.next();
		System.out.println("Por favor, insira a nota:");
		nota[x] = leia.nextInt();
	
		} 
		
		for(int x = 0; x <nomes.length; x ++){
			if (nota[x]<5) {
				System.out.printf("%s, a sua nota é %d ainda não!",nomes[x],nota[x] );
			} else if (nota[x]>5) {
				System.out.printf("%s, a sua nota é %d muito bem!",nomes[x],nota[x]);
				
			}
			
		}
		
	}

}
