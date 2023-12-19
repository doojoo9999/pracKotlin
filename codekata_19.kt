class Solution {
    fun solution(n: Long): Long {
        var x = Math.sqrt(n.toDouble()).toLong()
        if (x * x == n) {
            return (x + 1) * (x + 1)
        }
        else {
            return -1
        }
    }
}