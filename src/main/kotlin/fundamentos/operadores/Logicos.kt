package fundamentos.operadores

fun main() {
    val terca = true
    val quinta = false

    if (terca && quinta) println("Compra TV de 50")
    if (terca || quinta) println("Compra sorvete")
    if (terca xor quinta) println("Compra TV de 32")
}