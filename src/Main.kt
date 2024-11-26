fun main()
{
    var num: MutableList<Double> = mutableListOf()
    num.add(7.0)
    num.add(8.5)
    num.add(3.0)
    num.add(6.3)
    num.add(5.8)
    num.add(8.6)

    var media = num.average()

    if(media > 6) {
        println("O discente foi aprovado com a média de: $media")
    } else
    {
        println("O discente foi reprovado com a média de: $media")
    }
}
