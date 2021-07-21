package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario

fun main(){
    val joao = Analista( "João Roberto", "1234567899", 2000.0)
    ImprimeRelatorioFuncionario.imprime(joao)
}