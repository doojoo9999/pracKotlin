fun main(args: Array<String>) {
    val str = readLine()!!
    val result = str.map { c ->
        if (c.isUpperCase()) {
            c.toLowerCase()
        } else {
            c.toUpperCase()
        }
    }.joinToString("")
    println(result)
}