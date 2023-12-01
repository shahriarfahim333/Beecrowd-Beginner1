fun main(args: Array<String>) {
    val input = readLine()!!.split(" ")

    val a = input[0].toInt()
    val b = input[1].toInt()
    val c = input[2].toInt()

    val greatest = ((a + b + Math.abs(a - b)) / 2 + c + Math.abs(((a + b + Math.abs(a - b)) / 2) - c)) / 2

    println("$greatest eh o maior")
}