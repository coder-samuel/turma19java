package Exemplo;

import java.util.Scanner;

public class Atividade1 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int tempoSegundos, horas, minutos, segundos;
			
		System.out.println("Digite o total de segundos do evento: ");
		tempoSegundos = leia.nextInt();
		horas = tempoSegundos/3600;
		minutos = (tempoSegundos % 3600)/60;
		segundos = (tempoSegundos% 3600) % 60;
		System.out.printf("Horas %d, minutos %d e segundos %d" , horas, minutos, segundos);
	}

}
