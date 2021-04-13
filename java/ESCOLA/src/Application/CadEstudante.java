package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Basico;
import Entities.Medio;

public class CadEstudante {
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		char opcao;
		
		do {
		System.out.println("ESCOLA ALAN TURING");
		System.out.println();
		System.out.println();
		System.out.println("\n1 - Básico\n2 - Médio\n3 - Graduação\n4 - Pós\n5 - Mestrado\n6 - Sair");
		opcao = leia.next().charAt(0);
		if (opcao == '1') {
			System.out.println("Digite a matricula do aluno");
			int matricula = leia.nextInt();
			System.out.println("Digite o cpf do aluno");
			String cpf = leia.next();
			System.out.println("Digite dia de aniversário do aluno");
			int diaAniversario = leia.nextInt();
			
			
			Basico aluno = new Basico(matricula,cpf,diaAniversario);
			System.out.println("Digite a nota do aluno");
			double nota = leia.nextDouble();
			aluno.incluirPontos(nota);
			
			if(aluno.getPontos()<=5) {
				System.out.println("Ainda não");	
			}
			else {
				System.out.println("Parabéns");
			}
			System.out.println("Qual é o dia de hoje?");
			int diaAtual = leia.nextInt();
			aluno.bonusAniversario(diaAtual);
			System.out.println("Pontos atuais: "+aluno.getPontos());
			System.out.println("Continua 1-Sim ou 2-Não?");
			opcao = leia.next().charAt(0);	
		} else if (opcao == '2') {
			System.out.println("Digite a matricula do aluno");
			int matricula = leia.nextInt();
			System.out.println("Digite o cpf do aluno");
			String cpf = leia.next();
			
			Medio aluno = new Medio(matricula, cpf);
			double nota = leia.nextDouble();
			aluno.incluirPontos(nota);
			
			System.out.println("Continua 1-Sim ou 2-Não?");
			
		}
		
		} while (opcao !=6);
	

}
}