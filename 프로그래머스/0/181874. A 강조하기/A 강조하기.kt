class Solution {
    fun solution(myString: String): String {
        var answer: String = ""
        myString.forEach{ char ->
            when {
                char == 'a' -> answer += "A"
                char == 'A' -> answer += "A"
                else -> answer += char.lowercase()
            }
        }
        return answer
    }
}