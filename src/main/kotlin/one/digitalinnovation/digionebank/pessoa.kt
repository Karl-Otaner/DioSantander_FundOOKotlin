package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Carlos"
    var cpf: String = "123.123.123-11"
    private set // deixando privado o set, não é + permitido atribuir valor a propriedade!

    constructor()

    fun pessoalinf() = "$nome e $cpf"
}

fun main() {
    val carlos = Pessoa()


    println(carlos.pessoalinf())


}