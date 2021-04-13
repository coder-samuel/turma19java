package Collections;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class MapaAluno {
	public static void main(String args[]) {
		
		Map<String,Aluno> mapa = new TreeMap<String,Aluno>();
		
		Aluno a= new Aluno("João da silva","JAVA", 6.8);
		Aluno b= new Aluno("Maria da silva","Linux", 7.5);
		Aluno c= new Aluno("João dos Santos","SO", 6.0);
		Aluno d= new Aluno("Maria dos Santos","Internet", 9.8);
		
		mapa.put("João da Silva",a);
		mapa.put("Maria da Silva",b);
		mapa.put("João dos Santos",c);
		mapa.put("Maria dos Santos",d);
		System.out.println(mapa);
		System.out.println(mapa.get("Maria dos Santos"));
		
		Collection<Aluno> alunos = mapa.values();
		for(Aluno e:alunos) {
			System.out.println(e);
		}
	}

}
