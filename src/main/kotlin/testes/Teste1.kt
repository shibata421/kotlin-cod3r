package testes

interface Contavel {
    fun calcularImposto(a: Float): Float
}

open class Calcula(
    private val maxValor: Float,
    private val taxa: Float,
    private val proximo: Contavel? = null
    ) : Contavel
{
    override fun calcularImposto(a: Float) = (a - maxValor) * taxa + (proximo?.calcularImposto(maxValor) ?: 0F)
}

class Calcula028 : Calcula(4500F, 0.28F, Calcula018())
class Calcula018 : Calcula(3000F, 0.18F, Calcula008())
class Calcula008 : Calcula(2000F, 0.08F)


fun Float.calcularImposto() = when {
    this < 2000F -> 0F
    this < 3000F -> Calcula008().calcularImposto(this)
    this < 4500F -> Calcula018().calcularImposto(this)
    else -> Calcula028().calcularImposto(this)
}

fun main(args: Array<String>) {
    fun Float.format(digits: Int) = "%.${ digits }f".format(this).replace(',','.')
    val r = readLine()!!.toFloat()

    val i = r.calcularImposto()

    if (i == 0F) println("Isento") else println("R$ ${ i.format(digits = 2) }")
}