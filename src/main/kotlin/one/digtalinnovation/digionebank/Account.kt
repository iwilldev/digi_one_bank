package one.digtalinnovation.digionebank

import java.math.BigDecimal

class Account(
    val agency: Short,
    val number: Long,
    var balance: BigDecimal
) {
    fun deposit(value: BigDecimal) {

    }

    fun withdraw(value: BigDecimal) {

    }
}