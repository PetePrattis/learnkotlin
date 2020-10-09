class Car (val make: String, val model: String){

    fun accelerate(){
        println("faster")
    }

}

class Truck (val make: String, val model: String, val weigt: Int){

    fun tow(){
        println("heavy")
    }
}

fun main(){

    val car = Car("Honda","Jazz")
    println(car.make +" "+car.model)
    car.accelerate()

    val truck = Truck("Ford","F-150",10000)
    truck.tow()


}