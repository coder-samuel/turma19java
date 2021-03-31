package ListaAtividades2;

import java.util.Scanner;

/*Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
apresente no final o total do somatório, a média e o total de valores lidos. O programa
deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores
positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor
negativo.*/
public class Atividade3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero = 0, numeroLaco, media, soma=0, total = 0, contador=2;
		System.out.println("Digite um número qualquer:");
		numero = leia.nextInt();
		if (numero < 0) {
			System.out.println("Não foi possível realizar a operação");}
		while (numero >= 0) {
		System.out.println("Digite um novo número :");
		numeroLaco = leia.nextInt();
		soma = numero + numeroLaco;
		numero = soma + numeroLaco;
		media = soma / (contador++);
		System.out.println("A média da soma entres os números é igual a: "+media);
		contador++;
		
		}
	}

}
