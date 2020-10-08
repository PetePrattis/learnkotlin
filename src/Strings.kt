fun main() {

    val str = "A sentence"
    println(str)

    val str1 = "a sentence \n\"with escaped chars\"."
    println(str1)

    val str2 = """first line
        |second line
        |third line
    """.trimMargin()

    println(str2)

    for (char in str) {
        println(char)
    }

    println(str.contentEquals(str1))

    println(str1.contains(str,true))

    println(str.toUpperCase())

    val num = 6
    println(num.toString())

    println(str.subSequence(0,5))

    val name = "Pete"
    val lname = "Prattis"

    println(name +" ${lname.toUpperCase()} $num is not the number of letters ${lname.length}")

}
