package one.digtalinnovation.digionebank.tests

import one.digtalinnovation.digionebank.Analyst
import one.digtalinnovation.digionebank.Manager

fun main() {
    var william = Analyst(
        name = "William Gonçalves",
        cpf = "000.000.000-00",
        salary = 1200.00,
    )

    var mary = Manager(
        name = "Mary Jane",
        cpf = "000.000.000-00",
        salary = 4200.00,
        password = "senha123"
    )

    william.printInfo()
    mary.printInfo()

    AuthenticationTest().authenticate(mary)
}
