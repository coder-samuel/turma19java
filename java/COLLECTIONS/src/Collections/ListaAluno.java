package Collections;

import java.util.HashSet;
import java.util.Set;

public class ListaAluno {
	public static void main(String[]args) {
		Set<Aluno> conjunto = new HashSet<Aluno>();
		Aluno a= new Aluno("João da silva","JAVA", 6.8);
		Aluno b= new Aluno("Maria da silva","Linux", 7.5);
		Aluno c= new Aluno("João dos Santos","SO", 6.0);
		Aluno d= new Aluno("Maria dos Santos","Internet", 9.8);
		
		conjunto.add(a);
		conjunto.add(b);
		conjunto.add(c);
		conjunto.add(d);
		
		System.out.println(conjunto);
		
		
	}

}
