fun main() {

    val tableList = listOf("Alpha", "Delta", "Beta", "Gamma")

    println(tableList)
    println(tableList.sorted())
    println(tableList[3] + tableList.last())

    val arrayL = arrayListOf("I", "am", "Pete")
    println(arrayL.size)
    arrayL.add("Prattis")
    println(arrayL)
    arrayL.add(2, "the")
    println(arrayL)

    println(arrayL.indexOf("Pete"))

    arrayL.remove("am")
    println(arrayL)

    val mapL = mapOf("Pete" to "male", "Despo" to "female")
    println(mapL["Pete"])
    println(mapL.get("Despo"))
    println(mapL.getOrDefault("stav","don't assume"))
    println(mapL.keys)
    println(mapL.values)

    val hashmapL = hashMapOf("Pete" to "tall", "Despo" to "short")
    hashmapL["Despo"] = "kinda tall"
    hashmapL.put("stav","short")
    println(hashmapL)
    hashmapL.remove("Despo")
    hashmapL.clear()

}