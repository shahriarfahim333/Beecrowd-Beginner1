fun main(args: Array<String>) {

    val sellerName = readLine()!!
    val fixedSalary = readLine()!!.toDouble()
    val totalSales = readLine()!!.toDouble()

    val commission = 0.15 * totalSales
    val totalSalary = fixedSalary + commission

    println("TOTAL = R$ %.2f".format(totalSalary))
}