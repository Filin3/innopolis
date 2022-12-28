import kotlin.NumberFormatException
import kotlin.math.abs

fun main() {
    task1()
    task2()
    task3()
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

fun task3() {
    var score:Int

    while (true) {
        print("Enter your score: ")
        try {
            val inputScore = readln().toInt()
            if (inputScore < 0 || inputScore > 100) {
                println("Score can only be from 0 to 100")
            } else {
                score = inputScore
                break
            }
        } catch (e: NumberFormatException) {
            println("Only an integer is available for input")
        }
    }

    if (score >= 70) {
        println("Congrats! You’ve passed the test!")
    } else {
        println("Sorry, you’ve failed the test")
    }
}

