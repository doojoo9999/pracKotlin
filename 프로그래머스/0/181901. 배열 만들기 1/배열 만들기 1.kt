class Solution {
    fun solution(n: Int, k: Int): IntArray {
        val result = mutableListOf<Int>()
        for (i in k..n step k) {
            result.add(i)
        }
        return result.toIntArray()
    }
}