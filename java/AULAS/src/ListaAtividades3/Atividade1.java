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
// j� recebeu anteriormente, se n�o infelizmente n�o est� dispon�vel para voc� chefa de fam�lia, se sim tem direito ao dobro, recebe outro auxilio?
		// se sim, n�o recebece
		// para cada filho, 50 reais
		
		System.out.println("An�lise Aux�lio Emergencial");
		System.out.println("Ol�, bem-vinde!Por favor, informe-nos se voc� � benefici�rio de outro aux�lio, como o Bolsa Fam�lia?\nDigite 1 para SIM ou 2 para N�O:");
		resposta = leia.nextInt();
		System.out.println("Voc� recebeu o aux�lio anteriormente?\nDigite 1 para SIM ou 2 para N�O:");
		auxilioAnte = leia.nextInt();
		System.out.println("Voc� se auto declara chefa de fam�lia?\nDigite 1 para SIM ou 2 para N�O:");
		chefaFamilia = leia.nextInt();
		System.out.println("Por favor, informe o n�mero de filhos: ");
		numFilhos = leia.nextInt();
		
		if (resposta == 2) {
			
			System.out.println("Voc� � benefici�rio de outro aux�lio, como o Bolsa Fam�lia?\nDigite 1 para SIM ou 2 para N�O:");
			resposta = leia.nextInt();
			
		}
	}

}
