fun main(args: Array<String>) {
    parseInput(args)
        .groupingBy { it }
        .eachCount()
        .toList()
        .sortedWith(
            compareByDescending<Pair<String, Int>> { it.second }
                .thenBy { it.first }
        )
        .forEach { (word, count) ->
            println("$word $count")
        }
}

fun parseInput(args: Array<String>): List<String> {
    val input = if (args.isEmpty()) readLine() ?: "" else args.joinToString(" ") // на случай пустых args
    return input
        .replace("\"", "")
        .replace("\n", " ")
        .trim()
        .split(Regex("\\s+"))
        .filter { it.isNotEmpty() }
}