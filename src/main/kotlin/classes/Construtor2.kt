package classes

class Filme2(val nome: String, val anoLancamento: Int, val genero: String)

fun main() {
    val filme = Filme2("Monstros S.A", 2001, "Comédia")
    with(filme) { println("A ${ genero.toLowerCase() } $nome for lançada em $anoLancamento") }
}