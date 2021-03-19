programa
{
	
	funcao inicio()
	{
		cadeia  nome
		real tempCelsius 
		real tempFahrenheit 

	
		escreva("Qual é o seu nome?")
		leia(nome)
		escreva("Qual a temperatura em Celsius?")
		leia(tempCelsius)
		tempFahrenheit = ((tempCelsius * 9/5) + 32)
		escreva("Olá, ", nome," a temperatura em fahrenheit é:",tempFahrenheit,"°F")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 343; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */