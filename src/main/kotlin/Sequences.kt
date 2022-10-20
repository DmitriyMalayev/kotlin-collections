fun main() {
    val languages = listOf("kotlin", "c++", "java")
        .filter { it.length > 4 }
        .map { it.length }

    //Sequences apply all processing steps to each individual item saving processing power
    val languageSequence = sequenceOf("kotlin", "c++", "java")

    val fromIterable = listOf(1, 2, 3).asSequence()

    languageSequence.filter { it.length > 4 }.map { it.length }.take(2)
}