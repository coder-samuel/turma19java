
		package ListaAtividades2;

		import java.util.Scanner;

		public class Atividade {
			public static void main(String[] args) {
				Scanner leia = new Scanner(System.in);

				int numero = 0, soma = 0, media = 0, contador = 0;

				while(numero >= 0) {
					System.out.printf("Numeros informados: %d \n", contador);
					System.out.print("Digite um numero positivo: \n");
					numero = leia.nextInt();

					soma += numero;
					contador++;
				}

				media = soma/contador;

				System.out.printf("\nA soma dos valores é: %d \n", soma);
				System.out.printf("\nA média deles é: %d", media);
				System.out.printf("\nForam lidos: %d numeros inteiros.", contador);


	}

}
