class Solution {
    fun solution(angle: Int): Int {
        var answer: Int = 
        if (angle < 90){
            1
        } else if (angle == 90){
            2
        } else if (angle < 180){
            3
        } else if (angle == 180){
            4
        } else {
            println("잘못된 숫자입니다.")
            -1
        }
        return answer
    }
}