import kotlin.NumberFormatException
import kotlin.math.abs

fun main() {
    task1()
    task2()
}

fun task1() {
    var result:String = ""

    while (true) {
        print("Write something: ")
        val line = readln()
        if (line.lowercase() == "exit") break
        result += "\n${line}"
    }

    println(result)
}

fun task2() {
    var sum:Int = 0
    val number:Int
    print("Write a number: ")

    try {
        number = readln().toInt()
    } catch (e: NumberFormatException) {
        return println("Only an integer is available for input")
    }

    for (i in 0..abs(number)) {
        sum += i
    }

    if (number < 0) sum = -sum

    println("Sum from 0 to $number is $sum")
}

