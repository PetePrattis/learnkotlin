fun main() {

    var name : String = "Pete"
    //name = null

    var a = null
    var nullableV : String? = "Maybe I exist"
    //nullableV = null

    //println(nullableV.length)

    //Null check
    var length = 0
    if (nullableV != null) {
        length = nullableV.length
        println(nullableV.length)
    }
    else{
        length = -1
        println(length)
    }


    val l = if (nullableV != null) nullableV.length else -1

    //safe call operator
    nullableV = null
    println(nullableV?.length)

    //elvis operator
    val len = nullableV?.length ?: -1
    val newn = nullableV ?: "No one"

    println("$len $newn")

    //nullableV = null
    // !!
    //println(nullableV!!.length)

}