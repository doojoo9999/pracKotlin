class Solution {
    fun solution(s: String): String {
        var answer = s.toMutableList().sorted().sortedDescending()
        var answer2 = ""

        for(i in 0 until answer.size) {
            answer2 += answer[i].toString()
        }

        return answer2
    }
}