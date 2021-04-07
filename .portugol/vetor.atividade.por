programa
{
	
	funcao inicio()
	{
	
     	 
     	inteiro vetor[5] 
     	inteiro valorMaior = 0
     	
      	para(inteiro i=0; i<=4; i++) {
			
			escreva("\n Digite um valor: \n")
			leia (vetor[i])

			escreva("O valor do vetor na posicao " + i + " é: " + vetor[i] )

			se (vetor[i] > valorMaior ){
	
			valorMaior = vetor[i] 
			}

		
		}

			escreva("\n O maior valor é: " + valorMaior)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 398; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */