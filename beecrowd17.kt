fun main(args: Array<String>) {

    val timeSpent = readLine()!!.toInt()
    val averageSpeed = readLine()!!.toInt()

    val distance = timeSpent * averageSpeed
    val fuelNeeded = distance / 12.0

    println("%.3f".format(fuelNeeded))
}