package one.digitalinnovation.digionebank

class Pessoa {
    var name: String = "Carlos"
    var cpf: String = "123.123.123-11"

}

fun main(args: Array<String>){
    val Carlos = Pessoa()

    println(Carlos.name)
    println(Carlos.cpf)
}