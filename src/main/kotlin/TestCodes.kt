fun main() {
    val testScores = mapOf(
        "123abc" to 88.1,
        "124xyz" to 88.9,
        "345abc" to 82.1,
        "345bbc" to 72.1,
        "34efbc" to 66.1,
        "345abc" to 89.1,
        "385agc" to 62.1,
        "837abc" to 85.7,
        "9459bc" to 94.3,
        "nd2192" to 83.8,
    )

    println(testScores.map { it.value }.sorted().take(3))   //only test scores without student ids
    println(testScores.toList())
    println(testScores.toList().sortedBy { it.second })  //sort by test score
    println(testScores.toList().sortedBy { it.second }.map { it.first })  //map to student id
    println(testScores.toList().sortedBy { it.second }.map { it.first }.take(3)) //take 3 lowest values
    testScores.toList().sortedBy { it.second }.map { it.first }.take(3).forEach {
        println(it)
    }
}
//take 3 lowest values



