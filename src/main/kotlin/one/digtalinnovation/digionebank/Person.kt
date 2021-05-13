package one.digtalinnovation.digionebank

class Person {
    var name: String = "William" // Propriedade

    var cpf: String = "123.456.789-00"

    private set // Modificador de acesso
/*
    // Classe interna
    inner class Address {
        var street: String = "Rua Orquídeas"
    }
*/
    // Construtor
    constructor()

    // Método
    fun printInfo() = "Nome: $name | CPF: $cpf"
}

fun main() {
    val william = Person()

    println(william.name)
    println(william.cpf)
    // println(william.Address().street)
    println(william.printInfo())
}
