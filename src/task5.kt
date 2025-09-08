fun main(args: Array<String>) {
    args.groupingBy { it }
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