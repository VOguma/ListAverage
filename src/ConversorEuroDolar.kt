fun main() {
    println("Digite o valor do Euro")
    val euro = readln().toDouble()

    println("Quantos Euros você quer converter para o Dólar?")
    val quant_dolar = readln().toDouble()
    val dolar = quant_dolar / euro

    println("$dolar dólares")
}