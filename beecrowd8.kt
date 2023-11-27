fun main(args: Array<String>) {
    // Read input values
    val employeeNumber = readLine()!!.toInt()
    val workedHours = readLine()!!.toInt()
    val hourlyRate = readLine()!!.toDouble()

    // Calculate salary
    val salary = workedHours * hourlyRate

    // Print output with two decimal places
    println("NUMBER = $employeeNumber")
    println("SALARY = U$ %.2f".format(salary))
}