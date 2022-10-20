fun main() { //common collection types
    //read only
    val readOnlyList = listOf(1, 2, 3)
    val readOnlySet = setOf(1, 2, 3)
    val readOnlyMap = mapOf(1 to "a", 2 to "b")

    //mutable
    val mutableList = mutableListOf(1, 2, 3)
    val mutableSet = mutableSetOf(1, 2, 3)
    val mutableMap = mutableMapOf(1 to "a", 2 to "b")

    mutableList.size
    readOnlyMap.size

    mutableSet.isEmpty()
    readOnlyList.isNotEmpty()

    for (element in readOnlySet) {
        println(element)
    }

    mutableMap.forEach { key, value -> println("$key $value") }

    println(readOnlyList.first())
    println(mutableSet.first())

    println(mutableList.take(3))
    println(readOnlySet.take(2))

    println(mutableMap.filter { entry -> entry.key < 2 })
    println(mutableMap.filter { it.key < 2 })

    readOnlyList.filter { value -> value > 1 }

    //transforming collection type
    val languages = mapOf(
        "kotlin" to 5,
        "java" to 3,
        "javascript" to 4,
        "c++" to 2,
        "python" to 6
    )

    println(
        languages.filter { it.value >= 4 }   //Map
    )
    println(
        languages.filter { it.value >= 4 }.map { it.key }  //Strings
    )
    println(
        languages.filter { it.value >= 4 }.map { it.key }.sorted() //sorted
    )
    languages.filter { it.value >= 4 }.map { it.key }.sorted().forEach { println(it) }

}