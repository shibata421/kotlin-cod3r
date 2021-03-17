package classes

var desconto = 0.0

class ItemDePedido(val nome: String, var preco: Double) {
    companion object {
        fun create(nome: String, preco: Double) = ItemDePedido(nome, preco)
//        @JvmStatic var desconto = 0.0
    }

    fun precoComDesconto() = preco * (1.0 - desconto)
}

fun main() {
    val item1 = ItemDePedido.create("TV 50 Polegadas", 2989.9)
    val item2 = ItemDePedido("Liquidificador", 200.0)
    desconto = 0.10

    println(item1.precoComDesconto())
    println(item2.precoComDesconto())
}