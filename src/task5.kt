fun main(args: Array<String>) {
    val group = args.groupingBy { it }.eachCount()
        .toList()

    val sorted = group.sortedWith(
        compareByDescending<Pair<String, Int>> { it.second }
            .thenBy { it.first }
    )
    sorted.forEach { println("${it.first} ${it.second}") }
}