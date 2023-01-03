import kotlin.math.abs
import kotlin.math.truncate
import kotlin.random.Random


fun main() {
    conditionTask1()
    conditionTask2()
    conditionTask3()
    conditionTask4()
    conditionTask5()
    conditionTask6()
    conditionTask7()
    conditionTask8()

    cycleTask1()
    cycleTask2()
    cycleTask3()
    cycleTask4()
    cycleTask5()

    arrayTask1()
    arrayTask2()
    arrayTask3()
    arrayTask4()
    arrayTask5()
    arrayTask6()
    arrayTask7()
    arrayTask8()
}

fun conditionTask1() {
    val number: Double = readln("Напишите число: ").toDoubleOrNull() ?: return
    if (number > 10) {
        println("Число больше десяти")
    } else if (number == 10.0) {
        println("Число является числом десять")
    } else {
        println("Число меньше десяти")
    }
}

fun conditionTask2() {
    val numberOne: Double = readln("Напишите число: ").toDoubleOrNull() ?: return
    val numberTwo: Double = readln("Напишите число: ").toDoubleOrNull() ?: return

    if (numberOne > numberTwo) {
        println("Первое число больше чем второе")
    } else if (numberOne == numberTwo) {
        println("Числа равны")
    } else {
        println("Первое число меньше чем второе")
    }
}

fun conditionTask3() {
    val sideA: Double = readln("Введите сторону A: ").toDoubleOrNull() ?: return
    val sideB: Double = readln("Введите сторону B: ").toDoubleOrNull() ?: return
    val sideC: Double = readln("Введите сторону C: ").toDoubleOrNull() ?: return

    if (sideA == sideB && sideA == sideC) {
        println("Треуголник равносторонний")
    } else if (sideA == sideB || sideA == sideC || sideB == sideC) {
        println("Треуголник равнобедренный")
    } else {
        println("Треуголник разносторонний")
    }
}

fun conditionTask4() {
    var negativeNumberCount = 0
    var positiveNumberCount = 0
    while (negativeNumberCount + positiveNumberCount < 4) {
        val number: Double = readln("Введите чило ${negativeNumberCount + positiveNumberCount + 1}: ").toDoubleOrNull() ?: continue
        if (number == 0.0) continue
        if (number > 0) {
            positiveNumberCount++
        } else {
            negativeNumberCount++
        }
    }
    println("Отрицательных: $negativeNumberCount\n" +
            "Положительных: $positiveNumberCount")
}

fun conditionTask5() {
    var i:Int = 1
    var max:Double = Double.NEGATIVE_INFINITY

    while (i <= 3) {
        val number: Double = readln("Введите чило $i: ").toDoubleOrNull() ?: continue
        if (max < number) max = number
        i++
    }

    val result = if (truncate(max) == max) {
       max.toInt()
    } else {
        max
    }

    println("Max: $result")
}

fun conditionTask6() {
    var i:Int = 1
    var max:Double = Double.NEGATIVE_INFINITY
    var min:Double = Double.POSITIVE_INFINITY

    while (i <= 3) {
        val number: Double = readln("Введите чило $i: ").toDoubleOrNull() ?: continue
        if (max < number) max = number
        if (min > number) min = number
        i++
    }

    val sumOfMinMax = max + min

    val result = if (truncate(sumOfMinMax) == sumOfMinMax) {
        sumOfMinMax.toInt()
    } else {
        sumOfMinMax
    }

    println("MinMaxSum: $result")
}

fun conditionTask7() {
    val number: Int = readln("Введите целое чило: ").toIntOrNull() ?: return println("Некорректные входные данные")

    if (number % 2 == 0) {
      println("Число $number - чётное")
    } else {
        println("Число $number - нечётное")
    }
}

fun conditionTask8() {
    class Goods(val name: String, val price: Double) {
        fun buy(money: Double) {
            if (this.price > money) {
                println("Денег не хватает на покупку \"${this.name}\"")
            } else if (this.price == money) {
                println("Спасибо за покупку \"${this.name}\"")
            } else {
                println("Спасибо за покупку \"${this.name}\". Ваша сдача ${"%.2f".format(money - this.price)}")
            }
        }
    }

    val storeGoods = arrayOf<Goods>(
        Goods("Молоко", 35.0),
        Goods("Конфеты", 73.99),
        Goods("Чипсы", 119.95))

    val goodsPriceList = storeGoods.mapIndexed {
        i, value -> "${i+1}: ${value.name} - ${value.price}"
    }.joinToString("\n")

    println("***Добро пожаловать в магазин 5тёрочка***\n$goodsPriceList")

    while (true) {
        val number: Int = readln("Введите номер позиции для покупки: ").toIntOrNull() ?: continue

        if (number !in 1..storeGoods.size) {
            println("Такой позиции товара не существует")
            continue
        }

        val money: Double = readln("Введите денежную сумму: ").toDoubleOrNull() ?: continue

        storeGoods[number-1].buy(money)
        break
    }
}

fun cycleTask1() {
    for (i in 1..10) {
        println("4*$i = ${4*i}")
    }
}

fun cycleTask2() {
    val number: Double = readln("Введите число: ").toDoubleOrNull() ?: return

    for (i in 0  until abs(number.toInt())) {
        if (i % 2 == 0) {
            if (number >= 0.0) {
                println(i)
            } else {
                println(-i)
            }
        }
    }
}

fun cycleTask3() {
    val x: Int = readln("Введите X последовательности фибоначчи: ").toIntOrNull() ?: return println("X может быть только целым числом")
    if (x <= 0) return println("X может быть только положительным числом")

    var fibOne = 0
    var fibTwo = 1

    for (i in 1 until x) {
        val buffer = fibTwo
        fibTwo += fibOne
        fibOne = buffer
    }

    println(fibOne)
}

fun cycleTask4() {
    val n: Int = readln("Введите N факториал: ").toIntOrNull() ?: return println("X может быть только целым числом")
    if (n < 0) return println("X не может быть отрицательным числом")
    var result: Int = 1

    for (i in 1 .. n) result *= i

    println(result)

}

fun cycleTask5() {
    readln("Введите любое значение: ").forEach { println(it) }
}

fun arrayTask1() {
    val array = Array(Random.nextInt(10,25)) { Random.nextInt(-100,100) }

    var countOfPositive = 0
    var countOfNegative = 0

    array.forEach {
        if (it > 0) {
            countOfPositive++
        } else if (it < 0) {
            countOfNegative++
        }
    }

    println("Array: [${array.joinToString()}]")
    println("Negative: $countOfNegative\n" +
            "Positive: $countOfPositive")
}

fun arrayTask2() {
    val array = Array(Random.nextInt(5,15)) { Random.nextInt(-100,100) }

    var sumOfEvenIndexes = 0
    for (i in array.indices step 2) sumOfEvenIndexes += array[i]

    println("Array: [${array.joinToString()}]")
    println("sumOfEvenIndexes: $sumOfEvenIndexes")
}

fun arrayTask3() {
    val array = Array(Random.nextInt(5,15)) { Random.nextInt(-100,100) }

    var sumOfEven = 0

    array.forEach {
        if (it % 2 == 0) sumOfEven += it
    }

    println("Array: [${array.joinToString()}]")
    println("sumOfEven: $sumOfEven")
}

fun arrayTask4() {
    val array = Array(Random.nextInt(5,15)) { Random.nextInt(-100,100) }

    println("Array: [${array.joinToString()}]")
    println("Max: ${array.max()}")
}

fun arrayTask5() {
    val array = Array(Random.nextInt(15,30)) { Random.nextInt(-50,50) }
    var count = 0
    var value:Int? = null

    for (currentValue in array) {
        var currentCount = 0

        for (it in array) {
            if (currentValue == it) currentCount++
        }

        if (count < currentCount) {
            count = currentCount
            value = currentValue
        } else if (count == currentCount && value?.compareTo(currentValue) == -1) {
            value = currentValue
        }
    }

    println(array.joinToString())
    if (count <= 1) {
        println("В массиве нет повторяющихся элементов")
    } else {
        println("$value повторяется $count раз")
    }
}

fun arrayTask6() {
    val matrixSize = 10
    val array = Array(matrixSize) { Array(matrixSize) { Random.nextInt(10,100) } }

    for (row in array) {
        for (column in row) {
            print("$column ")
        }
        print("\n")
    }

    for (i in 0 until matrixSize) {
        println("${"   ".repeat(i)}${array[i][i]}")
    }
}

fun arrayTask7() {
    val matrixSize = 10
    val array = Array(matrixSize) { Array(matrixSize) { Random.nextInt(10,100) } }

    for (row in array) {
        for (column in row) {
            print("$column ")
        }
        print("\n")
    }

    for (i in 0 until matrixSize) {
        println("${"   ".repeat(matrixSize - 1 - i)}${array[i][matrixSize - 1 - i ]}")
    }
}


fun arrayTask8() {
    val matrixSize = 5
    val array = Array(matrixSize) { Array(matrixSize) { Random.nextInt(10,100) } }
    var maxSum:Int? = null

    for (row in array) {
        for (column in row) {
            print("$column  ")
        }
        print("\n")
    }
    println("-".repeat(matrixSize*4))

    for (i in 0 until matrixSize) {
        var sum:Int = 0

        for (j in 0 until matrixSize) {
            sum += array[j][i]
        }

        if (maxSum?.compareTo(sum) == -1 || maxSum == null) {
            maxSum = sum
        }
        print("$sum ")
    }
    println("\nmaxSum: $maxSum")
}

fun readln(inputMessage: String?): String {
    if (inputMessage != null) print(inputMessage)
    return readln()
}
