package Exemplo;

import java.util.Scanner;

public class Atividade4 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int dias, meses, anos, diasInfo; 
		 
		System.out.println("Digite quantos dias voc� tem de vivido ? ");
		diasInfo= leia.nextInt();
		anos= diasInfo / 365;
		meses= (diasInfo % 365)/ 30; 
		dias= (diasInfo % 365)% 30;
		System.out.printf (" voc� tem de ano :%d  voc� tem de meses :%d voc� tem de dias : %d ", anos, meses, dias);
		
	}

}
