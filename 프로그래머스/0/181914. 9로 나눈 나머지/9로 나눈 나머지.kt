class Solution {
    fun solution(number: String): Int {
        var answer: Int = 0
        for (char in number) {
            answer += char.toString().toInt()
        }
        return answer % 9
    }
}