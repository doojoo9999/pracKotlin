class Solution {
    fun solution(my_string: String, m: Int, c: Int): String {
        val answer = mutableListOf<Char>()
        val length = my_string.length
        
        for (i in c-1 until length step m) {
            answer.add(my_string[i])
        }
        return answer.joinToString("")
    }
}