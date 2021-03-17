package classes

class Calculadora {
    private var resultado = 0

    fun somar(vararg valores: Int): Calculadora {
        valores.forEach { resultado += it }
        return this
    }

    fun multiplicar(valor: Int): Calculadora {
        resultado *= valor
        return this
    }

    fun limpar(): Calculadora {
        resultado = 0
        return this
    }

    fun imprimir(): Calculadora {
        println(resultado)
        return this
    }

    fun obterResultado() = resultado
}

fun main() {
    val calculadora = Calculadora()
    calculadora.somar(1, 2, 3).multiplicar(3).imprimir()
    calculadora.somar(7, 10).imprimir().limpar()

    println(calculadora.obterResultado())
}