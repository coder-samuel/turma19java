programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
			// 3 Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
			//a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
			//das matrizes N1 e N2;
			//b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
			//posição das matrizes N1 e N2.

			inteiro n1 [4][6]
			inteiro n2 [4][6]
			inteiro m1 [4][6]
			inteiro m2 [4][6]
			inteiro numero 

			para (inteiro l=0; l<4; l++){
				para(inteiro c=0; c<6; c++){
					numero = Util.sorteia(1,9)
					n1[l][c] = numero 
					escreva("\n n1 ", n1[l][c]," ")

					numero = Util.sorteia(1,9)
					n2[l][c] = numero 
					escreva("\n n2 ", n2[l][c]," ")


					m1[l][c] = n1[l][c] + n2[l][c] 
					escreva("\n m1 ", m1[l][c], " ")
					
					m2[l][c] = n1[l][c] - n2[l][c]
					se (m2[l][c] <0) {
						m2[l][c] = m2[l][c] * -1 
						}
					escreva("\n m2 ", m2[l][c], " ")
					
					}

				
					
				
				}
				
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 426; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */