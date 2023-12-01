fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    var amount = N
    val notes = intArrayOf(100, 50, 20, 10, 5, 2, 1)

    println(N)

    for (note in notes) {
        val count = amount / note
        amount %= note
        println("$count nota(s) de R$ $note,00")
    }
}