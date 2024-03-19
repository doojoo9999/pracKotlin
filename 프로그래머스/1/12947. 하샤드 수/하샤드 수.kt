class Solution {
    fun solution(x: Int): Boolean {
        val sum = x.toString().sumOf { it - '0' }
        return x % sum == 0
    }
}