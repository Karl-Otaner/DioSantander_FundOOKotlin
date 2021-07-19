package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main(){
    val carlos = Pessoa(nome = "Carlos Silva", cpf = "123.123.123-12")
    println(carlos.nome)
    println(carlos.cpf)

    val joao = Funcionario( "Carlos Silva", "1234567899", BigDecimal.valueOf(2000.0))
    println(joao.nome)
    println(joao.cpf)
    println(joao.salario)

}