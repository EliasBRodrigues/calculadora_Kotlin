fun doSoma(numb: Int, number: Int): Int = numb + number
fun doSubs(numb: Int, number: Int): Int = numb - number
fun doMult(numb: Int, number: Int): Int = numb * number
fun doDivi(numb: Int, number: Int): Int = numb / number

fun main() {
    while (true) {
        println("Digite dois números: ")
        val numb = readLine()?.toIntOrNull() ?: 0
        val number = readLine()?.toIntOrNull() ?: 0

        println("---- Calculadora -----")
        println("1 - Somar \n2 - Subtrair \n3 - Multiplicar \n4 - Divisão \n0 - Sair")
        val operator = readLine()?.toIntOrNull() ?: 0
        var result: Int
        when (operator) {
            1 -> result = doSoma(numb, number)
            2 -> result = doSubs(numb, number)
            3 -> result = doMult(numb, number)
            4 -> result = doDivi(numb, number)
            else -> {
                println("Finalizado")
                return
            }
        }
        when (operator) {
            1 -> println("A soma entre $numb e $number é: $result")
            2 -> println("A subtração entre $numb e $number é: $result")
            3 -> println("A multiplicação entre $numb e $number é: $result")
            4 -> println("A divisão entre $numb e $number é: $result")
            else -> println("Erro")
        }
    }
}