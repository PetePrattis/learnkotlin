import java.util.*

fun main() {
    val arrayL = arrayListOf("I", "am", "Pete")

    val hashmapL = linkedMapOf("Pete" to "tall", "Despo" to "short", "stav" to "shorter")

    for (word in arrayL){
        println(word)
    }

    for ((key,value) in hashmapL){
        println(key + value)
    }

    var x = 10;

    while (x > 0) {
        println(x)
        x--
    }
}