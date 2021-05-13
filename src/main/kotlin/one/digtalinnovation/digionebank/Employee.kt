package one.digtalinnovation.digionebank

class Employee(
    name: String,
    cpf: String,
    val salary: Double
) : Person(name, cpf) {
    override fun printInfo() {
        println("Nome: $name\nCPF: $cpf\nSalário: $salary\n")
    }
}