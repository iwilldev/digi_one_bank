package one.digtalinnovation.digionebank

class Person {
    val name: String = "William"
    val cpf: String = "123.456.789-00"
}

fun main() {
    val william = Person()

    println(william.name)
    println(william.cpf)
}
