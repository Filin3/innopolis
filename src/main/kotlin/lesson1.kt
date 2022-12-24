import kotlin.math.pow

fun main() {
    val name = "Филипп"
    val secondName = "Громов"
    val profession = "Наладчик технологического оборудования"

    println("$name $secondName $profession")

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

    print("Write something: ")
    val readString:String = readln()
    println(readString.isEmpty())
}
