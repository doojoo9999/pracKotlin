class Solution {
    fun solution(s: String): String {
        var answer = s.split(" ").map { it.toInt() }
        val min = answer.minOrNull()
        val max = answer.maxOrNull()
        return "$min $max"
    }
}