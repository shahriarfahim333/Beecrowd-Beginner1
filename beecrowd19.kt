fun main(args: Array<String>) {

    val Seconds = readLine()!!.toInt()

    val hours = Seconds / 3600
    val remainingSeconds = Seconds % 3600
    val minutes = remainingSeconds / 60
    val seconds = remainingSeconds % 60

    println("$hours:$minutes:$seconds")
}