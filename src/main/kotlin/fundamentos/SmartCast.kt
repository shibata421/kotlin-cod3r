package fundamentos

fun souEsperto(x: Any) {
    if (x is String) {
        println(x.toUpperCase())
    } else if (x is Int) {
        println(x.plus(3))
    }
}

fun souEspertoEUsoWhen(x: Any) {
    when(x) {
        is String -> println(x.toUpperCase())
        is Int -> println(x.plus(3))
        else -> println("?")
    }
}

fun main() {
    souEsperto("Ola")
    souEspertoEUsoWhen(9)
}