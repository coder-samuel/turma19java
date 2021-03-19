programa
{
	
	funcao inicio()
	{
	inteiro numero
	
		escreva("Escreva um número:")
		leia(numero)

		se ((numero == 0 )) {
			escreva("O número ", numero, " é neutro!")}
		senao se (numero < 0 e (numero % 2)== 0 ) {
			
			escreva("O número", numero," é negativo e par.")
		
		}
		senao se (numero < 0 e (numero % 2)!= 1 ) {
			
			escreva("O número", numero," é negativo e impar.")
		
		}
		
		senao se ((numero % 2) == 0) {

			escreva("O número ", numero, " é positivo e par")
		}
		senao {escreva("O número ", numero, " é positivo e ímpar") 
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 320; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */