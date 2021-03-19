programa
{
	
	funcao inicio()
	{
		cadeia nome
		real tempCelsius 
		real tempFahrenheit 

	
		escreva("Qual é o seu nome?")
		leia(nome)
		escreva("Qual a temperatura em Fahreinheit?")
		leia(tempFahrenheit)
		tempCelsius = ((tempFahrenheit- 32) / 1.8)
		escreva("Olá, ", nome," a temperatura em Celsius é:",tempCelsius,"°C")
		
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 326; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */