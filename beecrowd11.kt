fun main(args: Array<String>) {

    val radius = readLine()!!.toDouble()

    val volume = (4.0 / 3) * 3.14159 * (radius * radius * radius)

    println("VOLUME = %.3f".format(volume))
}