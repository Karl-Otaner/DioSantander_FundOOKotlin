package one.digitalinnovation.digionebank

class Pessoa {
    var name: String = "Carlos"
    var cpf: String = "123.123.123-11"
    private set // deixando privado o set, não é + permitido atribuir valor a propriedade!

}

fun main() {
    val carlos = Pessoa()

    println(carlos)
    println(carlos.name)
    println(carlos.cpf)

   // println(carlos.Endereco().rua)

}