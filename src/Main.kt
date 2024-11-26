fun main()
{
    //Solicitar ao usuário os números
    println("Digite os números separados por espaço:")
    val input = readln() ?: ""

    //Converter a entrada em uma lista de números
    val numeros = input.split(" ").mapNotNull { it.toDoubleOrNull() }

    //Calcular a média
    if (numeros.isNotEmpty()) {
        val media = numeros.average()
        println("A média dos números é: $media")
    } else {
        println("Nenhum número válido foi fornecido")
    }
}