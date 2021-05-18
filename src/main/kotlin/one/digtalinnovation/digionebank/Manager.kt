package one.digtalinnovation.digionebank

class Manager(
    name: String,
    cpf: String,
    salary: Double
) : Employee(
    name,
    cpf,
    salary) {
    override fun calculateAssistance() = salary * 0.25
}