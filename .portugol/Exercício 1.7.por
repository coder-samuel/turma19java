programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{	inteiro tempoSegundos, horas, minutos, segundos
		escreva("Digite o total de segundos do evento: ")
		leia(tempoSegundos)
		horas = tempoSegundos/(60*60)
		minutos = tempoSegundos%360/60
		segundos = tempoSegundos%360%60
		escreva("O tempo estimado do evento é de ", horas," horas ",minutos," minutos ",segundos," segundos.") 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 400; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */