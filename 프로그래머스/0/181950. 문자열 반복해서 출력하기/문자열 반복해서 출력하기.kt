fun main(args: Array<String>) {
    val input = readLine()!!.split(' ')
    val str = input[0]
    val n = input[1].toInt()
    
    val result = StringBuilder()
    
    for (i in 1..n) {
        result.append(str)
    }
    
    println(result.toString())
}