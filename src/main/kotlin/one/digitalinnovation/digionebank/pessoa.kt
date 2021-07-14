package one.digitalinnovation.digionebank

class Pessoa {
    var name: String = "Carlos"
    var cpf: String = "123.123.123-11"

}

fun main() {
    val carlos = Pessoa()

    println(carlos.name)
    println(carlos.cpf)
}