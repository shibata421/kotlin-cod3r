package classes

class Cliente2 {
    constructor(nome: String) {
        this.nome = nome
    }

    var nome: String
        get() = "Meu nome é $field"
        set(value) {
            field = value.takeIf { value.isNotEmpty() } ?: "Anônimo"
        }
}

fun main() {
    val cliente = Cliente2("")
    println(cliente.nome)

    val cliente2 = Cliente2("Pedro")
    cliente2.nome = "Ana"
    println(cliente2.nome)
}