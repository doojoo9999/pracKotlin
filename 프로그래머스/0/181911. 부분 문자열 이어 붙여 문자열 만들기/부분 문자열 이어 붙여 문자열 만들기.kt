class Solution {
    fun solution(my_strings: Array<String>, parts: Array<IntArray>): String {
        var answer: String = ""
        
        for ( i in my_strings.indices) {
            val a = parts[i][0]
            val b = parts[i][1]
            answer += my_strings[i].substring(a, b+1)
        }
        
        return answer
    }
}