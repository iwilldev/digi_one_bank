package one.digtalinnovation.digionebank

open class Person(
    var name: String,
    var cpf: String,
) {
    open fun printInfo() {
        println("Nome: $name\nCPF: $cpf\n")
    }
}