package ListaAtividades2;

import java.util.Scanner;

/*Elaborar um programa que efetue a leitura sucessiva de valores num�ricos e
apresente no final o total do somat�rio, a m�dia e o total de valores lidos. O programa
deve fazer as leituras dos valores enquanto o usu�rio estiver fornecendo valores
positivos. Ou seja, o programa deve parar quando o usu�rio fornecer um valor
negativo.*/
public class Atividade3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero = 0, numeroLaco, media, soma=0, total = 0, contador=2;
		System.out.println("Digite um n�mero qualquer:");
		numero = leia.nextInt();
		if (numero < 0) {
			System.out.println("N�o foi poss�vel realizar a opera��o");}
		while (numero >= 0) {
		System.out.println("Digite um novo n�mero :");
		numeroLaco = leia.nextInt();
		soma = numero + numeroLaco;
		numero = soma + numeroLaco;
		media = soma / (contador++);
		System.out.println("A m�dia da soma entres os n�meros � igual a: "+media);
		contador++;
		
		}
	}

}
