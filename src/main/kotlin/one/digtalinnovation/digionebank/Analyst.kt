package one.digtalinnovation.digionebank

class Analyst(
    name: String,
    cpf: String,
    salary: Double
) : Employee(
    name,
    cpf,
    salary) {
    override fun calculateAssistance() = salary * 0.1
}