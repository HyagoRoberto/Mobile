import java.text.NumberFormat

fun Double.toCurrencyFormat(): String {
    val f = NumberFormat.getCurrencyInstance()
    return f.format(this)
}
fun main(){

    val valor: Double = 40.0
    println(valor.toCurrencyFormat())
}