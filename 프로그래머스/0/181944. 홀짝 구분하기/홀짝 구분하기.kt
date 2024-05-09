fun main(args: Array<String>) {
    var a = readLine()!!.toInt()
    if(a%2 == 0) {
        return println("${a} is even")
    } else {
        return println("${a} is odd")
    }
}