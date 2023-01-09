class Aircraft {
    private val manufacturer: String
    private val model: String
    private val passengerCapacity:Int
    private val maxPayloadWeight:Int
    private val maxFlyDistance:Int

    constructor(manufacturer:String, model:String, passengerCapacity:Int, maxPayloadWeight: Int, maxFlyDistance: Int) {
        this.manufacturer = manufacturer
        this.model = model
        this.passengerCapacity = passengerCapacity
        this.maxPayloadWeight = maxPayloadWeight
        this.maxFlyDistance = maxFlyDistance
    }

    fun printManufacturerAndModel() {
        println("${this.manufacturer} ${this.model}")
    }

    fun fly(flyDistance: Int, passengersOnBoard: Int, payload: Int) {
        if (flyDistance > maxFlyDistance) return println("Превышена максимальная дистанция полёта")
        if (passengersOnBoard > passengerCapacity) return println("Превышено максимальное количество пассажиров")
        if (payload > maxPayloadWeight) return println("Превышена максимальная грузоподъёмность самолёта")
        println("Приятного полёта")
    }
}

fun main() {
    val cessna171 = Aircraft("Cessna", "171", 5, 1156, 1289)
    val cessna151 = Aircraft("Cessna", "152", 3, 196, 768)

    cessna171.printManufacturerAndModel()
    cessna171.fly(1300, 2,500)
    cessna171.fly(500, 5, 750)

    cessna151.printManufacturerAndModel()
    cessna151.fly(250, 5, 550)
    cessna151.fly(300, 3, 1200)
}
