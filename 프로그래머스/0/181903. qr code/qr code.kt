class Solution {
    fun solution(q: Int, r: Int, code: String): String {
        var answer = StringBuilder()
        for (i in r until code.length step q) {
            answer.append(code[i])
        }
        return answer.toString()
    }
}