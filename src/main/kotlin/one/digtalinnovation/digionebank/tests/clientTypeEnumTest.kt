package one.digtalinnovation.digionebank.tests

import one.digtalinnovation.digionebank.ClientType

fun main() {
    ClientType.values().forEach {
        println("$it: ${it.description}")
    }

    val pf = ClientType.PF
    val pj = ClientType.PJ

    println("$pf: ${pf.description}")
    println("$pj: ${pj.description}")
}