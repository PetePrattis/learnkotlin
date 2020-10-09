open class Vehicle(val make: String, val model: String){

    open fun accelerate(){
        println("$model go faster")
    }

    fun brake(){
        println("$make go slower")
    }
}

class Car(make: String, model: String, var color: String) : Vehicle(make, model){
    override fun accelerate(){
        println("$model go even faster")
        super.accelerate()
    }
}

class Truck(make: String, model: String, var weight: Int): Vehicle(make, model)

//class Car (val make: String, val model: String){
//
//    fun accelerate(){
//        println("faster")
//    }
//
//}
//
//class Truck (val make: String, val model: String, val weigt: Int){
//
//    fun tow(){
//        println("heavy")
//    }
//}

fun main(){

//    val car = Car("Honda","Jazz")
//    println(car.make +" "+car.model)
//    car.accelerate()
//
//    val truck = Truck("Ford","F-150",10000)
//    truck.tow()

    val tesla = Car("Tesla","ModelS","Red")
    tesla.accelerate()

    val truck = Truck("Ford","F-150",10000)
    truck.accelerate()

}