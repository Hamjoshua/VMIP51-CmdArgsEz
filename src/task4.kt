fun main(args: Array<String>) {
    val group = args.groupingBy { it }.eachCount().toSortedMap()

    for ((word, countOf) in group){
        println("${word} ${countOf}")
    }
}