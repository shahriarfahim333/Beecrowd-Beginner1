import java.util.Scanner
fun main(args: Array<String>){
    var fahim = Scanner(System.`in`)

    var num1:Int = fahim.nextInt()
    var num2:Int = fahim.nextInt()
    var num3:Int = fahim.nextInt()
    var num4:Int = fahim.nextInt()

    var sum = num1*num2-num3*num4
    println("DIFERENCA = ${sum}")
}