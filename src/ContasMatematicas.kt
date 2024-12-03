fun main() {
    println("Digite o primeiro número: ")
    val num1 = readln().toDouble()
    println("Digite o segundo número: ")
    val num2 = readln().toDouble()

    val soma = num1 + num2
    val mult = num1 * num2
    val sub = kotlin.math.abs(num1 - num2)
    val div = num1 / num2
    val rest = num1 % num2

    println("Soma:" + soma)
    println("Subtração:" + sub)
    println("Multiplicação:" + mult)
    println("Divisão:" + div)
    println("Resto da divisão:" + rest)
}