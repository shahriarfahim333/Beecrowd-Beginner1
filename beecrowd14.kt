fun main(args: Array<String>) {

    val distance = readLine()!!.toInt()
    val fuelSpent = readLine()!!.toDouble()

    val averageConsumption = distance / fuelSpent

    println("%.3f km/l".format(averageConsumption))
}
