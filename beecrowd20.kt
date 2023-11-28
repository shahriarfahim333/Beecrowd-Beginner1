fun main(args:Array<String>) {

    val ageInDays = readLine()!!.toInt()

    val years = ageInDays / 365
    val months = (ageInDays % 365) / 30
    val days = (ageInDays % 365) % 30

    println("$years ano(s)")
    println("$months mes(es)")
    println("$days dia(s)")
}