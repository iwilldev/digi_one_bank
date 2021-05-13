package one.digtalinnovation.digionebank.tests

import one.digtalinnovation.digionebank.Employee

fun main() {
    var william = Employee(
        name = "William Gonçalves",
        cpf = "000.000.000-00",
        salary = 1200.00
    )

    william.printInfo()
}