package ListaAtividades;

import java.util.Scanner;

public class Atividade5 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		double indiceDePoluicao = 0.0;

		System.out.println("Informe o �ndice de polui��o: ");
		indiceDePoluicao = leia.nextDouble();

		if (indiceDePoluicao >= 0.3 && indiceDePoluicao < 0.4) {
			System.out.println(
					" Grupo 1 ultrapassou o limite do �ndice de polui��o.\nParar com as atividades imediatamente. ");

		} else if (indiceDePoluicao >= 0.4 && indiceDePoluicao < 0.5) {
			System.out.println(
					" Grupos 1 e 2 ultrapassaram o limite do �ndice de polui��o.\nParar com as atividades imediatamente.  ");
		} else if (indiceDePoluicao >= 0.5) {
			System.out.println(
					" Grupos 1, 2 e 3 ultrapassaram o limite do �ndice de polui��o.\\nParar com as atividades imediatamente.  ");
		} else {
			System.out.println(" As ind�strias est�o dentro do limite! ");
		}
	}
}