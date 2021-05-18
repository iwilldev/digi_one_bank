package one.digtalinnovation.digionebank

import one.digtalinnovation.digionebank.tests.AuthenticationTest

abstract class Employee(
    name: String,
    cpf: String,
    val salary: Double
) : Person(name, cpf) {
    protected abstract fun calculateAssistance(): Double
    fun printInfo() {
        println("""
       Nome: $name
       CPF: $cpf
       Salário: $salary
       Auxílio: ${calculateAssistance()} 
        """.trimIndent())
    }
}