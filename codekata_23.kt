class Solution {
    fun solution(num: Int): Int {
        var answer = num
        var inforcount = 0
        var forcount = 0
       
        for(inforcount in 1..500){
            if(answer % 2 == 0){
                answer = answer/2
                forcount = forcount + 1
            } else if(answer % 2 > 0 && answer != 1) {
                answer = (answer*3)+1
                forcount = forcount + 1
            } else if(answer == 1) {
                break
            } 
            
            if(inforcount==500) {
                return -1
                break
            }

        }

        return forcount
    }
}