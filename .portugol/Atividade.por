programa
{
	
	funcao inicio()
	{
		const inteiro HABITANTES = 20
			real salario = 0.00
			inteiro numFilhos = 0
			real mediaSalarios
			real totalSalarios = 0.00
			real mediaNumeroFilhos = 0.00
			inteiro totalNumeroFilhos = 0
			real maiorSalario = 0.00
			real percentualPessoasAte100 = 0.00

		para(inteiro x =1; x <= HABITANTES; x++){}
		
		escreva("Informe o salário do habitante: ")
		leia(salario)
		escreva("Informe o numero de filhos do habitantes: ")
		leia(numFilhos) 
		totalSalarios= totalSalarios + salario
		totalNumeroFilhos = totalNumeroFilhos + NumFilhos 

		se (maiorSalario < salario)
		{
			maiorSalario = salario
			}

		mediaSalarios = totalSalarios / HABITANTES 
		
		escreva("\nTotal de salários:", totalSalarios)
		escreva("\nTotal de Filhos:", totalNumeroFilhos)
		escreva("\nMédia salarial:", mediaSalarios)
		escreva("\nMaior salário:", maiorSalario)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 583; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */