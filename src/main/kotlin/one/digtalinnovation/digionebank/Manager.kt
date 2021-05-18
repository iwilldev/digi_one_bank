package one.digtalinnovation.digionebank

class Manager(
    name: String,
    cpf: String,
    salary: Double,
    val password: String
) : Employee(
    name,
    cpf,
    salary), Logable {
    override fun calculateAssistance() = salary * 0.25
    override fun login(): Boolean = "senha123" === password
}