package one.digtalinnovation.digionebank

class Person {
    var name: String = "William"

    var cpf: String = "123.456.789-00"
    private set
/*
    inner class Address {
        var street: String = "Rua Orquídeas"
    }
*/
}

fun main() {
    val william = Person()

    println(william.name)
    println(william.cpf)
    // println(william.Address().street)
}
