package classes

class Filme {
    val nome: String
    val anoLancamento: Int
    val genero: String

    constructor(nome: String, anoLancamento: Int, genero: String = "Drama") {
        this.nome = nome
        this.anoLancamento = anoLancamento
        this.genero = genero
    }
}

fun main() {
    val filme = Filme("O Poderoso Chefao", 1972)
    with(filme) { println("O $genero $nome for lançado em $anoLancamento.") }
}