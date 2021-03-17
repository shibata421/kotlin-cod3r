package testes

fun main(args: Array<String>) {
    //continue a solução
    val n = readLine()!!.toInt()
    val listaNaoPrimos = HashSet<Int>()

    for (i in 1..n) {
        val x = readLine()!!.toInt()

        for (j in 2..x) {
            if (!listaNaoPrimos.contains(j)) {
                for (k in (j+1)..x) {
                    if ((!listaNaoPrimos.contains(k)) && (k % j == 0)) listaNaoPrimos.add(k)
                }
            } else {
                println("hi $j")
            }
        }
        println(listaNaoPrimos)
        if (listaNaoPrimos.contains(x)) println("Not Prime") else println("Prime")
    }

}