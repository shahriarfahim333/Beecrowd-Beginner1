import java.util.Scanner

fun main(array: Array<String>) {
    var scanner = Scanner(System.`in`)

    var gradeA = scanner.nextDouble()
    var gradeB = scanner.nextDouble()

    var average = ((gradeA * 3.5) + (gradeB * 7.5)) / (3.5 + 7.5)
    println("MEDIA = ${"%.5f".format(average)}")
}
