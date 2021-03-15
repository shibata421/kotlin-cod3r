package funcoes

import java.time.LocalDateTime

data class Horario(val hora: Int, val minuto: Int, val segundo: Int)

fun agora(): Horario {
    val agora = LocalDateTime.now()

    with(agora) {
        return Horario(hour, minute, second)
    }
}

fun main() {
    val (h, m, s) = agora()
    println("$h:$m:$s")
}