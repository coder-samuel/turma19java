package ListaAtividades3;

import java.util.Locale;
import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); // instanciado o tipo de moeda, teclado, decimais etc.
		Scanner leia = new Scanner(System.in);
		int numFilhos, resposta, chefaFamilia, auxilioAnte;
		double soma, valorBase, valorChefa;
		valorBase = 300.00;
		valorChefa = 600.00;
// já recebeu anteriormente, se não infelizmente não está disponível para vocé chefa de família, se sim tem direito ao dobro, recebe outro auxilio?
		// se sim, não recebece
		// para cada filho, 50 reais
		
		System.out.println("Análise Auxílio Emergencial");
		System.out.println("Olá, bem-vinde!Por favor, informe-nos se você é beneficiário de outro auxílio, como o Bolsa Família?\nDigite 1 para SIM ou 2 para NÃO:");
		resposta = leia.nextInt();
		System.out.println("Você recebeu o auxílio anteriormente?\nDigite 1 para SIM ou 2 para NÃO:");
		auxilioAnte = leia.nextInt();
		System.out.println("Você se auto declara chefa de família?\nDigite 1 para SIM ou 2 para NÃO:");
		chefaFamilia = leia.nextInt();
		System.out.println("Por favor, informe o número de filhos: ");
		numFilhos = leia.nextInt();
		
		if (resposta == 2) {
			
			System.out.println("Você é beneficiário de outro auxílio, como o Bolsa Família?\nDigite 1 para SIM ou 2 para NÃO:");
			resposta = leia.nextInt();
			
		}
	}

}
