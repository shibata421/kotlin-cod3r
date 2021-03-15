package funcoes

fun ordernar(vararg numeros: Int, a: Int): IntArray {
    println(a)
    return numeros.sortedArray()
}

fun main() {
    for (n in ordernar(38, 3, 456, 8, 51, 88, 73, 1, a = 6)){
        print("$n ")
    }
}