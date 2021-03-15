package funcoes

inline fun transacao(funcao: () -> Unit) {
    println("Abrindo Transacao")
    try {
        funcao()
    } finally {
        println("Fechando Transacao")
    }
}

fun main() {
    transacao {
        println("Executando SQL 1....")
        println("Executando SQL 2....")
        println("Executando SQL 3....")
    }
}