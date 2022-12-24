import kotlin.math.pow

fun main() {
    //task #1
    val name = "Филипп"
    val secondName = "Громов"
    val profession = "Наладчик технологического оборудования"

    println("$name $secondName $profession\n")

    //task #2
    var byteVar:Byte = 10
    var shortVar:Short = 31000
    var intVar:Int = 2.0.pow(30.0).toInt()
    var longVar:Long = 2.0.pow(62.0).toLong()

    var floatVar:Float = 0.333F
    var doubleVar:Double = Math.PI

    var booleanVar:Boolean = true

    var charVar:Char = 'F'

    var stringVar:String = "My cool string"

    var arrayVarInt: IntArray = intArrayOf(1, 2 ,5)

    var uByteVar:UByte = 255u
    var uShortVar:UShort = 64000u
    var uIntVar:UInt = 2.0.pow(30.0).toUInt()
    var uLongVar:ULong = 2.0.pow(63.0).toULong()

    println("byte: $byteVar\n" +
            "short: $shortVar\n" +
            "int: $intVar\n" +
            "long: $longVar\n" +
            "float: $floatVar\n" +
            "double: $doubleVar\n" +
            "boolean: $booleanVar\n" +
            "char: $charVar\n" +
            "string: $stringVar\n" +
            "IntArray: ${arrayVarInt.joinToString()}" +
            "UByte: $uByteVar\n" +
            "UShort: $uShortVar\n" +
            "UInt: $uIntVar\n" +
            "ULong: $uLongVar"
    )

    //task #3
    print("\nWrite something: ")
    val readString:String = readln()

    println("isEmpty: ${readString.isEmpty()}\n" +
            "charAt(2): ${readString[2]}\n" +
            "equals(\"another string\"): ${readString == "another string"}\n" +
            "equalsIgnoreCase(\"another string\"): ${readString.equals("another string", ignoreCase = true)}\n" +
            "startsWith(\"another\"): ${readString.startsWith("another")}\n" +
            "startsWith(\"string\", 8): ${readString.startsWith("string", 8)}\n" +
            "endsWith(\"ing\"): ${readString.endsWith("ing")}\n" +
            "contains(\"r s\"): ${readString.contains("r s")}\n" +
            "concat(\" added something new\"): ${readString.plus(" added something new")}\n" +
            "replace(\"string\", \"new string\"): ${readString.replace("string", "new string")}\n" +
            "toLowerCase: ${readString.lowercase()}"
    )

    val buildMyString = StringBuilder("Моё имя ")
    buildMyString.append(name)
    println(buildMyString)
}
