fun main() {
    val languages = mutableSetOf("kotlin", "java", "c++", "kotlin")  //don't allow duplicates
    val notMutableLanguages = setOf("kotlin", "java", "c++", "kotlin")  //don't allow duplicates

    for (language in languages) {
        println(language)
    }
    languages.size
    println(languages.contains("kotlin"))

    languages.add("javascript")
    languages.remove("javascript")

    val testScores = mutableMapOf(Pair(123, 91.2), Pair(456, 84.5), 789 to 79.1)  //3 Key Value Pairs
    val regularTestScores = mapOf(Pair(123, 91.2), Pair(456, 84.5), 789 to 79.1)

    println(testScores[123])
    println(regularTestScores[123])


    for ((id, score) in testScores) {
        println("score for user $id was $score")
    }
    for (record in testScores) {
        println("score for user ${record.key} was ${record.value}")
    }
    testScores.containsKey(123)
    testScores.containsValue(100.0)

    testScores.keys.forEach { println(it) }

    testScores[111] = 97.8
    testScores.put(222, 72.1)
    testScores.remove(222)
    testScores.replace(111, 98.7)
}