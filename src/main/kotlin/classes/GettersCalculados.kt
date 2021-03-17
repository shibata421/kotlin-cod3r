package classes

class Produto(
    var nome: String,
    var preco: Double,
    var desconto: Double,
    var ativo: Boolean
    )
{
    val inativo:Boolean get() = !ativo
    val precoComDesconto: Double get() = preco * ( 1.0 - desconto )
}

fun main() {
    val p1 = Produto("iPad", 2349.90, 0.2, ativo = true)
    println(p1.precoComDesconto)

    val p2 = Produto("Galaxy Note 7", 2699.49, 0.50, ativo = false)
    with(p2){
        println("$nome")
        println("   De: R$ $preco")
        println("   Por: R$ $precoComDesconto")
        if(inativo) {
            preco = 0.0
            println("Depois de inativo: R$ $precoComDesconto")
        }
    }



}