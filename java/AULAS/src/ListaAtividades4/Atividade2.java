package ListaAtividades4;

import java.util.Scanner;
/*Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.*/

public class Atividade2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int int1, int2, int3;
		
		System.out.println("Por favor, insira um n�mero inteiro qualquer: ");
		int1 = leia.nextInt();
		System.out.println("Por favor, insira mais um n�mero inteiro qualquer: ");
		int2 = leia.nextInt();
		System.out.println("Por favor, insira um �ltimo n�mero inteiro qualquer: ");
		int3 = leia.nextInt();
		
		if (int1 == int2 && int1 == int3) {
			System.out.printf("Os n�meros s�o equivalentes: %d, %d, %d",int1,int2,int3);
			}
		else if (int1 <= int2 && int2 <= int3) {
			System.out.printf("Os n�meros em ordem crescente s�o %d, %d e %d",int1,int2,int3);
		}	else if (int1 >= int2 && int2 >= int3) {
			System.out.printf("Os n�meros em ordem crescente s�o %d, %d e %d",int3,int2,int1);
		}
		else if (int2 >= int1 && int2 >= int3 && int3 < int1) {
			System.out.printf("Os n�meros em ordem crescente s�o %d, %d e %d\n",int2,int3,int1);
		}
		else if (int2 >= int1 && int2 >= int3 && int3 > int1) {
			System.out.printf("Os n�meros em ordem crescente s�o %d, %d e %d\n",int1,int3,int2);
		}
		System.out.println("\nPROGRAMA FINALIZADO!");

	}

}
