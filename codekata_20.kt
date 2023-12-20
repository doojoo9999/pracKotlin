class Solution {
    fun solution(n: Long): Long {
        val strvalue = n.toString().map { it }
        
        val answer = strvalue.sortedDescending().joinToString("")
        
        return answer.toLong()
    }
}
