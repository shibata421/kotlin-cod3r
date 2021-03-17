package classes

enum class DiaSemana2(val id: Int, val nome: String, val util: Boolean) {
    DOMINGO(1, "domingo", false),
    SEGUNDA(2, "segunda", true),
    TERCA(3, "terça", true),
    QUARTA(4, "quarta", true),
    QUINTA(5, "quinta", true),
    SEXTA(6, "sexta", true),
    SABADO(7, "sábado", false)
}

fun main() {
    for (dia in DiaSemana2.values()) {
        with(dia) {
            println("${ nome.capitalize() } é um dia ${ if(util) "útil" else "do fim de semana" }")
        }
    }
}