fun main() {
    task1()
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

