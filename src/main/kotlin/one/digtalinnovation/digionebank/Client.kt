package one.digtalinnovation.digionebank

class Client (
    name: String,
    cpf: String,
    val account: Account,
) : Person(name, cpf) {
    fun printInfo() {
        println(
            "Nome: $name\n" +
            "CPF: $cpf\n" +
            "Banco: ${account.bank.name}\n" +
            "Agência: ${account.agency}\n" +
            "Conta: ${account.number}\n")
    }
}