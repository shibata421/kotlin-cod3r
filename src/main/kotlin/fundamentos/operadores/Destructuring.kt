package fundamentos.operadores

data class Carro(val marca: String, val modelo: String)

fun main() {
    val ( a, b ) = Carro("Ford", "Fusion")
    println(a)
    println(b)

    val ( marido, mulher ) = listOf("João", "Maria")
    println("$marido - $mulher")

    val ( _, _, terceiroLugar ) = listOf("Kimi", "Hamilton", "Alonso")
    println("$terceiroLugar terminou em terceiro lugar.")
}