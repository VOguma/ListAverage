fun main()
{
    val num: MutableList<Int> = mutableListOf()
    num.add(7)
    num.add(3)
    num.add(7)
    num.add(7)

    var media = num.average()

    println("A média do aluno foi de: $media")
}
