import java.util.Calendar
import kotlin.NumberFormatException
import kotlin.math.abs

fun main() {
    task1()
    task2()
    task3()
    task4()
    task5()
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

fun task4() {
    val channelArray = arrayOf<String>(
        "TVNZ",
        "Maori Television",
        "TVNZ Duke",
        "Bravo Plus 1",
        "Rush",
        "Al Jazeera",
        "Shine TV",
        "Te Reo",
        "Parliament TV",
        "Discovery",
        "National Geographic",
        "Adult Swim"
    )

    while (true) {
        val number:Int
        print("Enter channel number: ")

        try {
            number = readln().toInt()
            if (number == 0) break

            if (number >= 1 && number <= channelArray.size) {
                println("Channel number $number - ${channelArray[number-1]}")
            } else {
                println("Channel not found. Available channels 1 - ${channelArray.size}")
            }
        } catch (e: NumberFormatException) {
            println("Only an integer is available for input")
        }
    }
}

fun task5() {
    val menu:String = "1. Ввести имя\n" +
            "2. Ввести фамилию\n" +
            "3. Ввести год рождения\n" +
            "4. Вывести информацию\n" +
            "0. Выход\n" +
            "Введите цифру из меню: "

    var name:String? = null
    var secondName:String? = null
    var yearOfBirthDay:Int? = null

    fun printUserAbout() {
        if (name != null && secondName != null && yearOfBirthDay != null) {
            println("Имя: $name\n" +
                    "Фамилия: $secondName\n" +
                    "Год рождения: $yearOfBirthDay")
        } else {
            println("Вы забыли указать одно или более из следующих значений: имя, фамилия, год рождения")
        }
    }

    fun setName() {
        print("Введите имя: ")
        val potentialName = readln()
        if (strContainsOnlyLetters(potentialName)) {
            name = potentialName
        } else {
            println("Имя не было задано так как введено некорректное значение")
        }
    }

    fun setSecondName() {
        print("Введите фамилию: ")
        val potentialSecondName = readln()
        if (strContainsOnlyLetters(potentialSecondName)) {
            secondName = potentialSecondName
        } else {
            println("Фамилия не была задана так как введено некорректное значение")
        }
    }

    fun setYearOfBirthDay() {
        try {
            print("Введите год рождения: ")
            val potentialYear = readln().toInt()
            if (potentialYear >= 1900 && potentialYear <= Calendar.getInstance().get(Calendar.YEAR)) {
                yearOfBirthDay = potentialYear
            } else {
                println("Год рождения не был задан так как введено некорректное значение")
            }
        } catch (e: NumberFormatException) {
            println("Для ввода доступны только целые числа")
        }
    }

    while (true) {
        val choice:Int
        print(menu)
        try {
            choice = readln().toInt()
            when (choice) {
                1 -> setName()
                2 -> setSecondName()
                3 -> setYearOfBirthDay()
                4 -> printUserAbout()
                0 -> break
            }
        } catch (e: NumberFormatException) {
            println("Для ввода доступны только целые числа")
        }
    }
}

fun strContainsOnlyLetters(str: String):Boolean {
    val pattern = Regex("[a-zA-Zа-яА-Я]")
    val matches = pattern.findAll(str)
    val result = matches.map { it.value }.joinToString("")

    return str == result
}
