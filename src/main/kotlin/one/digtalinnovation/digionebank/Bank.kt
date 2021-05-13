package one.digtalinnovation.digionebank

data class Bank(
    val name: String,
    val number: Short,
){
  fun printInfo() = "$name $number"
}
