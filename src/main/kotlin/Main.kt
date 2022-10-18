fun main() {
    val nullableInts = arrayOf(1, 2, 3, 4, null)
    val arrayOfNonNullInts = arrayOf(1, 2, 3, 4, 5)


    val nulls = arrayOfNulls<Int>(5)
    //arrayOf(null, null, null, null, null)  Can support nulls or ints in the future.

    val custom = Array(5) { index -> index }
    //initialization lambda

    val sizeOfArray = nullableInts.size

    //Syntactic sugar
    val firstValue = nullableInts[0]
    val alsoFirstValue = nullableInts.get(0)

    nullableInts.set(0, 99)
    nullableInts[0] = 99

    //Saves memory
    val primitiveInts = intArrayOf(1, 2, 3, 4, 5)
    val primitiveUShorts = ushortArrayOf(1u, 2u, 3u, 4u, 5u)

    for (i in 0 until nullableInts.size) {
        println(nullableInts[i])
    }

    for (element in nullableInts) {
        println(element)
    }

    //lambda
    nullableInts.forEach { element -> println(element) }
    nullableInts.forEach { println(it) }


    greetThings("Hey", arrayOf("Kotlin", "Programming"))
    greetThingsSimplified("Hello", "Kotlin", "Programming", "LinkedIn")
}

//requires a new instance of an array every time we call a function
fun greetThings(greeting: String, items: Array<Any>) {
    for (item in items) {
        println("$greeting $item")
    }
}
fun greetThingsSimplified(greeting: String, vararg items: Any) {
    for (item in items) {
        println("$greeting $item")
    }
}