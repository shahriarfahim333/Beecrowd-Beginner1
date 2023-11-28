fun main(args: Array<String>) {

    val (code1, units1, price1) = readLine()!!.split(" ").map { it.toDouble() }
    val (code2, units2, price2) = readLine()!!.split(" ").map { it.toDouble() }

    val totalAmount = (units1 * price1) + (units2 * price2)

    println("VALOR A PAGAR: R$ %.2f".format(totalAmount))
}