class Solution {
    fun solution(n: Int): IntArray {
        val answer = mutableListOf<Int>()
        
        for (i in 1..n) {
            if (n % i == 0) {
                answer.add(i)
            }
        }
        
        answer.sort()
        
        return answer.toIntArray()
    }
}
