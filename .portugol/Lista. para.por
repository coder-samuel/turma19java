programa
{
	
	funcao inicio()
	{
		inteiro soma = 0
		inteiro multiplos
		escreva("Os números multilplos de 3 e ímpares da contagem de 1 a 500:")
		
		para (multiplos = 1; multiplos <= 500; multiplos++)
		{ 
			se (multiplos%3 ==0)
			{	se (multiplos%2 !=0) 
			{ soma = multiplos + soma 

			escreva(multiplos,",")
				}
				}
			}
		escreva("\nA soma dos números multiplos de 3 e ímpares é:", soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 352; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */