package one.digitalinnovation.digionebank

enum class ClienteTipo(val descricao: String) {
    PF("Pessoa Fisica"),
    PJ("Pessoa Juridica");

/*
  companion object {
//Nós dá a opção de criar funções estaticas, acessadas via class e não via instacia do objeto.

        fun printDescricao() = ClienteTipo
    }
 */
}