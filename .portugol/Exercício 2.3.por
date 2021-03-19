programa
{
	inclua biblioteca Texto
	
	funcao inicio()
	{	cadeia formaTrat
		cadeia nome
		real sBruto, sLiquido, imposto
		
		escreva("Digite  o seu nome?")
		leia(nome)
		escreva("Olá, antes de inciarmos o nosso cálculo de IR, por favor, informe a forma de tratamento  que você se sinta mais confortável:\nEx: MASCULINO, FEMENINO ou NÃO-BINÁRIE:")
		leia(formaTrat)
		escreva("Digite o seu salário bruto:")
		leia(sBruto)
		
		Texto.caix_alta(formaTrat)
		
		se (sBruto <= 1200) { 
		escreva("Sr. o seu sálario)
		leia(nome)
		}

		senao se (formaTrat == "Feminino") {
			escreva("Bem-vinda ao nosso sistema de cálculo! Qual é o seu nome?")
		}
		
		se (formaTrat == "Não-Binárie" ou "Não binário" ou "Não binária")
		escreva("Bem-vinde ao nosso sistema de cálculo! Qual é o seu nome?"
		leia


		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 517; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */