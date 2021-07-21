package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente

fun main(){
    val maria = Gerente( "Maria do Carmoo", "9987654321", 5000.0)
    ImprimeRelatorioFuncionario.imprime(maria)
}
