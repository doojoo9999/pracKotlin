class Solution {
    fun solution(my_string: String, k: Int): String {
        var answer: String = ""
        for(i in 0..k-1){
            answer += my_string
        }
        return answer
    }
}