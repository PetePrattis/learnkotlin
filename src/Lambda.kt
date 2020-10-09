fun main() {

    val printMsg = { message: String -> println(message)}

    printMsg("Hi")

    val sumA = { a: Int, b: Int -> a+b}
    println(sumA(1,2))

    val sumB : (Int,Int) -> Int = {x,y -> x+y}

    downloadData("something.com", {
        println("This will run after the completion")
    })

    downloadCarData("car.com"){car ->
        println(car.color)
        car.accelerate()
    }
    downloadCarData("car.com"){
        println(it.color)
        it.accelerate()
    }

    downloadTruckData("truck.com"){truck, success ->
        if(success){
            //we have the truck
            truck?.accelerate()
        }
        else
            println("truck missing")
    }

}

fun downloadData(url: String, completion: ()-> Unit){
    //all good
    completion()
}

fun downloadCarData(url: String, completion: (Car) -> Unit){
    //all good
    val car = Car("Tesla", "ModelS","Red")
    completion(car)
}

fun downloadTruckData(url: String, completion: (Truck?, Boolean) -> Unit){
    //job done
    val webRequestSuccess = true
    if (webRequestSuccess){
        //got data
        val truck = Truck("Ford","F-150",1000)
        completion(truck,true)
    }
    else
        completion(null,false)
}
