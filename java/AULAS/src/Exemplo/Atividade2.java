package Exemplo;

import java.util.Scanner;

public class Atividade2{
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int anos, meses, dias, totalAnos;
		int quantAnos= 365;
	    int quantMeses= 30;
	    int totalMeses; 
	    int resultado; 
	    
				
	
		System.out.println("Digite quantos anos voc� tem? ");
		anos = leia.nextInt();
		
		System.out.println("Digite quantos meses voc� tem? ");
		 meses= leia.nextInt();
		 
		 System.out.println("Digite quantos dias voc� tem? ");
		 dias= leia.nextInt();
		 
		 totalAnos= anos*quantAnos;
		 totalMeses= meses*quantMeses;
		 resultado= totalAnos + totalMeses + dias; 
		 
		 System.out.println ( " total de dias vividos " + resultado );
		
		 
	}
}
