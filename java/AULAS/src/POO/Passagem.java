package POO;

import java.util.Scanner;

public class Passagem {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Aviao modelo1 = new Aviao();
		System.out.println("Escreve o nome da sua companhia:");
		modelo1.nomeCompanhia = leia.next();
		System.out.println("Digite o n�mero do seu  assento:");
		modelo1.numeroAcentos = leia.nextInt();
		System.out.println("Qual a classe do seu voo:");
		modelo1.classe = leia.next();
		
		System.out.printf("A companhia �rea � %s", modelo1.nomeCompanhia);
		System.out.printf("\nO n�mero do assento � %d", modelo1.numeroAcentos);
		System.out.printf("\nAclasse do voo escolhida � %s", modelo1.classe);
		
		
		// TODO Auto-generated method stub

	}

}
