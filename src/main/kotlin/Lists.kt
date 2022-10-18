fun main() {
    val stringList: List<String> = listOf("kotlin", "code", "puppy")
    val listOfInts = listOf(1, 2, 3)
    val listOfNullableInts = listOf(1, 2, 3, null)

//    println(List<Int>(5))

    val doubledValuess = List<Int>(5) { index ->
        index
    }

    val doubledValues = List<Int>(5) { index ->
        2 * index
    }

    doubledValuess.forEach { println(it) }
    doubledValues.forEach { println(it) }

    val emptyStringList: List<String> = emptyList()

    val firstInt = listOfInts.get(0)
    val secondInt = listOfInts[1]

    /*
    These will produce a compiler error
    Kotlin differentiates between mutable and immutable collection types.

    listOfInts.add()
    listOfInts[0] = 9

    By default, list is an immutable type.
    */
    val languages = mutableListOf("kotlin", "java")
    languages[0] = "Kotlin"
    languages.set(0, "Kotlin")

    languages.add("javascript")
    languages.add(1, "c++")
    languages.remove("javascript")
    languages.removeAt(0)

    //Mutable List extends List
    val aList: List<String> = mutableListOf("dog", "cat")
}

