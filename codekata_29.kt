class Solution {
    fun solution(s: String): String {
        var answer = ""
        var half = s.length / 2
        var halfm = (s.length / 2) - 1
        
        if (s.length in 1..100){
            if (s.length % 2 == 0) {
                answer = s.get(halfm).toString() + s.get(half).toString()
            } else {
                answer = s.get(half).toString()
            }
        }
        
        return answer
    }
}