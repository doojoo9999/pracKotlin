class Solution {
    fun solution(n: Int): Int {
        var three = n.toString(3)
        val reverse = three.reversed()
        return reverse.toInt(3)
    }
}