package one.digtalinnovation.digionebank

class Account(
    val bank: Bank,
    val agency: Int,
    val number: Int,
    var balance: Double
) {
    fun deposit(value: Double) {
        println("Saldo anterior: $balance")
        println("Depósito: $value")
        balance += value
        println("Saldo após operação: $balance")
    }

    fun withdraw(value: Double) {
        println("Saldo anterior: $balance")
        println("Saque: $value")
        balance -= value
        println("Saldo após operação: $balance")
    }
}