package POO;

import java.util.Locale;
import java.util.Scanner;

public class ProdutoEletronico {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);
        Eletronico produto1 = new Eletronico();

        System.out.println("Informe seu produto [1] Celular - [2] Notebook - [3] Computador");
        produto1.categoria = leia.next().charAt(0);
        System.out.println("Informe a marca: ");
        produto1.marca = leia.next();
        System.out.println("Informe o valor: ");
        produto1.valor = leia.nextDouble();
        System.out.println("Qual o tipo de uso? [1] Pessoal - [2] Comercial");
        produto1.tipoUso = leia.next().charAt(0);
        System.out.println("Seu produto � portatil? [1] Sim - [2] N�o");
        produto1.portatil = leia.next().charAt(0);

        System.out.println("O seu produto � um: "+produto1.lista());
        System.out.println("A marca �: "+produto1.marca);
        System.out.println("O valor �: "+produto1.valor);
        System.out.println("O uso dele �: "+produto1.uso());
        System.out.println("E ele � port�til: "+produto1.levar());

    }

}

