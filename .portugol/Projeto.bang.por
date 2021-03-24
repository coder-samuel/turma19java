programa
{
	inclua biblioteca Util
				inteiro dia
				inteiro diaAniversario = 10
				cadeia numero
				cadeia cpf
				cadeia status
				logico ativa
				real limiteCredito = 0.00
				real saldoCredito = 0.00
				caracter moviBancaria
				real saldoDebito = 500.00
				caracter opcao
				cadeia tipo
				real valorPag = 0.00
				real valorEmprestimo
				real dividendo = 0.00
	
	funcao inicio()
	{	
		
		faca 
		{	limpa()
			escreva("BANG-3\n")
			escreva("Um banco feito para a sua geração\n")
			escreva("\n")
			escreva("Você selecionou a opção que permite o acesso à:\n") 
			Util.aguarde(3000)
			limpa()
			escreva("BANG-3\n")
			escreva("Um banco feito para a sua geração\n")
			
			escreva("Número da conta: ")
			leia(numero)
			escreva("Insira o seu CPF: ")
			leia(cpf)
			escreva("Informe o digito correspondente ao status em que se encontra a sua conta:\n1 - Ativa\n2 - Inativa\n")
			escreva("Status da conta: ")
			leia(status) 
			se (status == "1") {
				ativa = verdadeiro 
				
				}
				senao {
					ativa = falso
					}
					limpa()
			escreva("BANG-3\n")
			escreva("Um banco feito para a sua geração\n")
			escreva("\n1 - CONTA POUPANÇA\n")
			escreva("2 - CONTA CORRENTE\n")
			escreva("3 - CONTA ESPECIAL\n")
			escreva("4 - CONTA EMPRESA\n")
			escreva("5 - CONTA ESTUDANTIL\n")
			escreva("6 - SAIR\n")
	
			escreva("Bem-vinde, digite o número da opção escolhida: ")
			leia(opcao)
			se (opcao == '1' ){

				 poupanca()
				 	
				}
				
				
				 senao se (opcao == '2') {

				tipo = "CORRENTE"
				cabecalho(tipo)
				Util.aguarde(2000)
				} senao se (opcao == '3') {
					especial()
				
				} senao se (opcao == '4') {

				tipo = "EMPRESA"
				cabecalho(tipo)
				Util.aguarde(2000)
				}
				senao se (opcao == '5')
				{ 
					estudantil()
					
					 
				}  
						
				
				 senao se  (opcao == '6') {

				escreva("\nVocê escolheu a opção SAIR\n")
				Util.aguarde(1500)
				
				} 	senao {
					escreva("Você não selecionou um número entre 1 e 6\n")
					escreva("Tente novamente: ")
					leia(opcao)
					}
				
			
		} enquanto (opcao != '6') 
			escreva("\nPrograma finalizado com sucesso!")
	}
	
		funcao cabecalho (cadeia tipo){
			limpa()
			escreva("BANG-3\n")
			escreva("Um banco feito para a sua geração\n")
			escreva("\n")
			escreva("Você selecionou a opção que permite o acesso à:\n") 
			Util.aguarde(3000)
			limpa()
			escreva("BANG-3\n")
			escreva("Um banco feito para a sua geração\n")
			escreva("\nCONTA ", tipo,"\n")
			escreva("Número da conta: ")
			leia(numero)
			escreva("Insira o seu CPF: ")
			leia(cpf)
			escreva("Informe o digito correspondente ao status em que se encontra a sua conta:\n1 - Ativa\n2 - Inativa\n")
			escreva("Status da conta: ")
			leia(status) 
			se (status == "1") {
				ativa = verdadeiro 
				
				}
				senao {
					ativa = falso
					}
			
			
			}

		funcao poupanca ()
		{	
			
		inteiro contador = 1
		caracter movimento
		real valorMovimento
		caracter continua
		inteiro niver = 10
		real saldo = 500.00
		inteiro dia

		
				escreva("Informe qual o dia de hoje: ")
				leia(dia)
				se (dia == niver)
				{
				saldo = (saldo * 0.05) + saldo

				escreva("Seu saldo foi atualizado para R$ ", saldo)
				}

		faca
		{
			faca
			{
				limpa()
				escreva("CONTA POUPANÇA\n\n")
				escreva("Saldo atual: R$",saldo,"\n")
				escreva("Digite 1 para débitos ou 2 para crédito. ")
				leia(movimento)
				se(movimento != '1' e movimento != '2')
				{
					escreva("Opção inválida. Tente realizar outra operação: ")
					Util.aguarde(2000)
				}
			}enquanto(movimento != '1' e movimento != '2')
			escreva("Valor da transação: R$")

			
			leia(valorMovimento)
			se(movimento =='1')
			{
				se(valorMovimento >= saldo)
				{
					escreva("Não é possível realizar esta operação, saldo insuficiente\n")
					Util.aguarde(3000)
				}
				senao
				{
					saldo = saldo - valorMovimento
					escreva("Saldo atual: R$", saldo)
					Util.aguarde(4000)
				}
			}
			senao
			{
				saldo = saldo+valorMovimento
				escreva("Saldo atual: R$", saldo)
				Util.aguarde(4000)
			}
			
			faca
			{
				limpa()
				escreva("Deseja fazer outra operação?\n1 para Sim ou 2 para não. ")
				leia(continua)
				se(continua != '1' e continua != '2' )
				{
					escreva("Opção inválida. Tente realizar outra operação: ")
					Util.aguarde(3000)
					limpa()
				}
			}enquanto(continua != '1' e continua != '2')
			
			se(continua == '1')
			{
				se(contador < 10)
				{
					contador++
				}
				senao
				{
					escreva("Limite de operações excedido.\n")
					escreva("obrigado por usar o Banco Solícite G3!\n Tenha um ótimo dia!")
					Util.aguarde(5000)
					contador++
				}
			
			}
			senao
			{
				contador = 11
				limpa()
				escreva("Obrigado por usar o banco G3. \nTenha um ótimo dia!")
				Util.aguarde(3000)
				
			}
			
		}enquanto(contador <= 10)
	}
			funcao estudantil()
			{
				tipo = "ESTUDANTIL"
				real limiteEstudantil
				cabecalho(tipo)
					para(real x=1.0; x<=10; x++){
					 	
					 	 
					 	real valorPag = 0.00
					 	real valorEmprestimo
					 	real dividendo = 0.00
					 	

					 	
					 	escreva("\nNúmero de transações: ", x,"\n")
					 	escreva("Saldo Atual: R$", saldoDebito,"\n")
					 	escreva("Movimentação bancária:\nC - Crédito\nD - Débito\nInsira o tipo de movimentação: ")
					 	leia(moviBancaria)
						se (moviBancaria != 'C' e moviBancaria != 'D')
						{
					 		faca { 
							
								escreva("\nPor favor, digite apenas uma das alternativas abaixo!\nEM CAIXA ALTA, OKAY?\n")
								escreva("Movimentação bancária:\nC - Crédito\nD - Débito\nInsira o tipo de movimentação: ")
								leia(moviBancaria)
								Util.aguarde(1000)
					 		} enquanto (moviBancaria != 'C' e moviBancaria != 'D')
					 		
					 	}
					 	
					 		senao se 	(moviBancaria =='C') {
					 		escreva("\nLimite de crédito disponível :", saldoCredito,"\n")
					 		escreva("\nValor à Pagar: ")
					 		leia(valorPag)
					 		dividendo = (saldoCredito - saldoCredito) + valorPag
					 		escreva("\nFatura :",dividendo,"\n")}
					 		senao se (moviBancaria == 'D') {
					 		escreva("Valor à pagar: ")
					 		leia(valorPag)
					 		saldoDebito = saldoDebito
					 		saldoDebito = saldoDebito - valorPag 
					 		}
					}
			}
		funcao especial () {
		real limite = 1000.00
		inteiro cont = 1
		inteiro opcao
		inteiro opcao2
		real valorTransacao = 0.00
		real contador
		real resto
		inteiro movimentacoes = 10
		real saldo = 500.00
		limpa()
			faca
			{		
				faca{	
					limpa()
					
					escreva("\nCONTA ESPECIAL")
					escreva("\nSaldo atual: ", saldo,"\n")
					escreva("\nLimite disponível: ", limite)
					escreva("\nEscolha uma das operações a seguir:\n'1' para débito\n'2' para crédito\n")
					escreva("\nDigite o número da operação selecionada: ")
					leia(opcao2)
					se(opcao2 != 1 e opcao2 != 2)
					{
						escreva("\nOpção inválida. Tente realizar outra operação: ")
						Util.aguarde(3000)
						limpa()
					}
					
				} enquanto(opcao2 != 1 e opcao2 != 2)
					se(opcao2 == 2 ou opcao2 == 2)
					{
						escreva("\nDigite o valor da transação: R$")
						leia(valorTransacao)
						se(limite < 1000)
						{
							limite = limite + valorTransacao
							se(limite > 1000)
							{
								saldo = saldo + limite - 1000
								limite = 1000.00
							}
						}
						senao
						{

							saldo = saldo + valorTransacao
							escreva("\nSeu saldo atual é de: R$",saldo,"\nSeu limite é de: R$",limite)
							Util.aguarde(4000)
							limpa()
						}
					}
					senao se(saldo>=0)
					{
						escreva("Digite o valor da transação: R$")
						leia(valorTransacao)
						saldo = saldo - valorTransacao
					
						se(saldo < 0 )
						{
							se ((limite*-1) <= saldo)
							{
								limite = limite + saldo
								saldo = saldo - saldo
								limpa()
								escreva ("\nVocê atingiu o limite do cheque especial")
								escreva("\nSaldo atual: R$",saldo)
								escreva("\nLimite cheque especial: R$",limite)
								Util.aguarde(4000)
								limpa()
							}
							senao
							{
								escreva("Não é possível realizar esta operação, limite insuficiente\n")
								Util.aguarde(3000)
								limpa()
								saldo = saldo + valorTransacao
							}
						}
					}
						escreva("Deseja fazer outra operação? Digite '1' para continuar ou '2' para encerrar operações: ")
						leia(opcao)
						se(opcao == 1)
						{
							movimentacoes--
							se(movimentacoes == 0)
							{
								escreva("Limite de operações atingido.\n")
								escreva("Obrigado por usar o banco G6! Bom dia!")
								Util.aguarde(5000)
							}
					
						}
						senao
						{
							movimentacoes = 0
						}
			}enquanto(movimentacoes !=0)
			
	
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 7384; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */