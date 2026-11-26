fun main() {
    println("Hello, world!")
    val popcorn = 5
    var cola = "Dobry"
    println(popcorn)
    println(cola)
    cola = "Coca"
    println(cola)
    println("Coca-${cola}")
    val customList: List<String> = listOf("csdc", "cdscds")
    println("${customList} --- ${customList[0]}---${customList.last()}")
    val mutList: MutableList<Int> = mutableListOf(1,4,5)
    println("${mutList} --- ${mutList[1]}--- ${mutList.first()}")
    println("csdc" in customList)
    mutList.add(6)
    println("${mutList}")
    mutList.remove(6)
    println("${mutList}")
    val cSet: Set<String> = setOf("csdc","34fvf")
    val mSet: MutableSet<String> = mutableSetOf("rfersc", "cecer")
    mSet.add("cdscdcd")
    println("${mSet}")
    println(mSet.count())
    mSet.remove("cdscdcd")
    println("${mSet}")
    println(mSet.count())
    val cMap: Map<String, Int> = mapOf("apple" to 100, "kiwi" to 190)
    val mMap: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190)
    println(cMap["apple"])
    mMap["cocco"] = 3444
    println(mMap.containsKey("cocco"))
    mMap.remove("cocco")
    println(mMap.containsKey("cocco"))
    println(mMap.keys)
    println(mMap.values)
    val a =1
    val b = 2
    if (a > b) {
        println(1)
    } else {
        println(2)
    }
    println(if (a > b) 1 else 2)

    when ("hello") {
        "1" -> println("1")
        "hello" -> println("2")
        else -> println("unknown")
    }

    val cuWen = when ("hello") {
        "1" -> println("1")
        "hello" -> println("2")
        else -> println("unknown")
    }
    println(cuWen)

    val trafficLightState = "Red" // This can be "Green", "Yellow", or "Red"

    val trafficAction = when {
        trafficLightState == "Green" -> "Go"
        trafficLightState == "Yellow" -> "Slow down"
        trafficLightState == "Red" -> "Stop"
        else -> "Malfunction"
    }

    println(trafficAction)
    val trafficLightState1 = "Red" // This can be "Green", "Yellow", or "Red"

    val trafficAction1 = when (trafficLightState1) {
        "Green" -> "Go"
        "Yellow" -> "Slow down"
        "Red" -> "Stop"
        else -> "Malfunction"
    }

    println(trafficAction)
    val d = 1..<4
    println(d)

    for(number in 1..5) {
        println(number)
    }

    val cakes = listOf("carrot", "cheese", "chocolate")

    for (cake in cakes) {
        println("Yummy, it's a $cake cake!")
    }
    var cakes1 = 0
    while (cakes1 < 3) {
        println(cakes1)
        cakes1 ++
    }

    var pizzaSlices = 0
    // Start refactoring here
    pizzaSlices++
    println("There's only $pizzaSlices slice/s of pizza :(")
    pizzaSlices++
    println("There's only $pizzaSlices slice/s of pizza :(")
    pizzaSlices++
    println("There's only $pizzaSlices slice/s of pizza :(")
    pizzaSlices++
    println("There's only $pizzaSlices slice/s of pizza :(")
    pizzaSlices++
    println("There's only $pizzaSlices slice/s of pizza :(")
    pizzaSlices++
    println("There's only $pizzaSlices slice/s of pizza :(")
    pizzaSlices++
    println("There's only $pizzaSlices slice/s of pizza :(")
    pizzaSlices++
    // End refactoring here
    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")

    var pizzaSlices1 = 0
    // Start refactoring here
    while (pizzaSlices1 < 8){
        pizzaSlices1++
        println("There's only $pizzaSlices1 slice/s of pizza :(")
    }
    // End refactoring here
    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")


    for (number in 1..100) {
        println(when {
            number % 3 == 0 && number % 5 == 0 -> "fizzbuzz"
            number % 3 == 0  -> "fizz"
            number % 5 == 0  -> "buzz"
            else -> number
        })
    }

    val words = listOf("dinosaur", "limousine", "magazine", "language")
    for (word in words){
        if (word.startsWith("l")) {
            println(word)
        }
    }
}
