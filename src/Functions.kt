fun main() {

    testFunction()

    val par = "blah"
    testFunctionArgs(par)

    println("sum is ${calculateFunction(4,1)}")

    printFunction("this is string that overrides")


}

fun testFunction(){
    println("inside test function")
}

fun testFunctionArgs(line: String){
    println(line)
}

fun calculateFunction(a: Int, b: Int): String{
    return (a + b).toString()
}

fun printFunction(str: String = "this is a string"){
    println(str)
}