package classes

class Pessoa1(var nome: String)
class Pessoa2(val nome: String)
class Pessoa3(nomeInicial: String) {
    // nomeInicial não está disponível fora da classe
    val nome = nomeInicial
}

fun main() {
    val p1 = Pessoa1("João")
    p1.nome = "Guilherme"
    println("${ p1.nome } sabe programar")

    val p2 = Pessoa2(nome = "Maria")
    val p3 = Pessoa3(nomeInicial = "Pedro")
    print("${ p2.nome } e ${ p3.nome } são legais!")
}