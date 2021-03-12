package fundamentos

fun main() {
    // Tipos numericos
    val num1: Byte = 127
    val num2: Short = 32767
    val num3: Int = 2_147_483_647
    val num4: Long = Long.MAX_VALUE

    // Tipos reais
    val num5: Float = 3.14f
    val num6: Double = 3.14

    // Tipo caractere
    val char: Char = '?'

    // Tipo boolean
    val boolean: Boolean = true

    println(listOf(num1, num2, num3, num4, num5, num6, char, boolean))
    println(2 is Int)
    println(55555555555555 is Long)
    println(1.0 is Double)

    // Tudo é objeto
    println(10.dec())
}