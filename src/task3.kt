fun main(args: Array<String>) {
    val argsSet = args.toSet()
    val newArgs = argsSet.toTypedArray()
    newArgs.sort()

    for (i in 0..(newArgs.size - 1)) {
        println(newArgs[i])
    }
}