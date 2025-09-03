fun main(args: Array<String>) {
    args.sort()

    for (i in 0..(args.size - 1)) {
        println(args[i])
    }
}