package one.digtalinnovation.digionebank.tests

import one.digtalinnovation.digionebank.Bank

fun main() {
    val digiOneBank = Bank(name = "Digi One", number = 120)

    println(digiOneBank.name)
    println(digiOneBank.number)

    val bankCopy = digiOneBank.copy(name = "Digi Two")

    println(bankCopy.name)
    println(bankCopy.number)
    println(bankCopy.printInfo())
}