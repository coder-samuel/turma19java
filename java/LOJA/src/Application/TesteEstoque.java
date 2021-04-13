package Application;

import java.util.Locale;

import Entity.Doces;
import Entity.Livros;
import Entity.Produto;
import Entity.Roupas;


public class TesteEstoque {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Produto prod1 = new Produto("CAMISA","XL001",100.25);
		Livros prod2 = new	Livros("RECREIO","RR0023", 25.50);
		Roupas prod3 = new	Roupas("CALÇA","CC0046", 25.50,"ZARA");
		Doces prod4 = new Doces("CALÇA","CC0046", 25.50,"ZARA");
		
		System.out.println(prod1.getDescricao()+" R$ "+prod1.getValorUnitario()+" estoque "+prod1.getQtdeEstoque());
		prod1.setValorUnitario(80.55);
		prod1.incluirEstoque(20);
		System.out.println(prod1.getDescricao()+" R$ "+prod1.getValorUnitario()+" estoque "+prod1.getQtdeEstoque()+" custo total "+(10*prod1.getValorUnitario()));
		prod1.tirarEstoque(10);
		System.out.println(prod1.getDescricao()+" R$ "+prod1.getValorUnitario()+" estoque "+prod1.getQtdeEstoque());
		

}

}

