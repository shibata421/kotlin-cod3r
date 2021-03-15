package funcoes

fun <E> filtrar(lista: List<E>, filtro: (E) -> Boolean): List<E> {
    val listaNova = ArrayList<E>()
    for (elemento in lista) {
        if(filtro(elemento)) {
            listaNova.add(elemento)
        }
    }
    return listaNova
}

fun comTresLetras(nome: String) = nome.length == 3

fun main() {
    val lista = listOf("Ale", "Nick", "Jon", "Youh")
    val listaFiltrada = filtrar(lista, ::comTresLetras)
    println(listaFiltrada)
}