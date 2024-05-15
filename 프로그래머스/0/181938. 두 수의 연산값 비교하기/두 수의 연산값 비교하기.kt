class Solution {
    fun solution(a: Int, b: Int): Int {
        var answer1: Int = (a.toString() + b.toString()).toInt()
        var answer2: Int = 2*a*b
        if (answer1 >= answer2){
            return answer1
        } else {
            return answer2
        }
    }
}