import kotlin.math.PI
fun main(args: Array<String>) {
    val input = readLine()!!.split(" ")

    val A = input[0].toDouble()
    val B = input[1].toDouble()
    val C = input[2].toDouble()

    val triangleArea = (A * C) / 2
    val circleArea = PI * C * C
    val trapeziumArea = ((A + B) * C) / 2
    val squareArea = B * B
    val rectangleArea = A * B

    println("TRIANGULO: %.3f".format(triangleArea))
    println("CIRCULO: %.3f".format(circleArea))
    println("TRAPEZIO: %.3f".format(trapeziumArea))
    println("QUADRADO: %.3f".format(squareArea))
    println("RETANGULO: %.3f".format(rectangleArea))
}