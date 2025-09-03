fun main(args: Array<String>) {
    var argsChangeable : List<String> = args.toList()
    if(argsChangeable.isEmpty()){
        val line = refactorString(readLine()!!)
        argsChangeable = line.split(" ")
    }
    val group = argsChangeable.groupingBy { it }.eachCount()
        .toList()
    val sorted = group.sortedWith(
        compareByDescending<Pair<String, Int>> { it.second }
            .thenBy { it.first }
    )
    sorted.forEach { println("${it.first} ${it.second}") }
}

fun refactorString(input: String) : String{
    var line = input.replace("\"", "")
    line = line.replace("\t", "")
    line = line.trim()
    return line
}