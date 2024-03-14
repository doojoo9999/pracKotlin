class Solution {
    fun solution(n: Long): IntArray {
        var str = n.toString()
        var reversed = str.reversed()
        var len = reversed.length
        var answer = IntArray(len)
        for (i in 0 until len) {
            answer[i] = reversed[i].toString().toInt()
        }

        return answer
    }
}