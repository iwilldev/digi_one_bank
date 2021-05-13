package one.digtalinnovation.digionebank.tests

import one.digtalinnovation.digionebank.Account
import one.digtalinnovation.digionebank.Bank
import one.digtalinnovation.digionebank.Client

fun main() {
    var william = Client(
        name = "William Gonçalves",
        cpf = "000.000.000-00",
        account = Account(
            Bank("Bradesco", 123),
            110,
            1200,
            1500.00)
    )

    william.account.withdraw(120.00)
}