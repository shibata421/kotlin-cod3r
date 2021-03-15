package fundamentos.operadores

fun main() {
    var x = 1
    var y = 2

    x++
    println(x)
    --x
    println(x)

    println(++x == y--)
    println(x == y)
}