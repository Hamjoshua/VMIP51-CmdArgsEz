fun main(args: Array<String>) {
    val group = args.groupingBy { it }.eachCount().toSortedMap()
    group.forEach { (word, countOf) ->
        println("$word $countOf")
    }
}