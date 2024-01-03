class Solution {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        var a = 0
        
        for(i in 0 until absolutes.size){

            if(signs[i] == true) {
                a += absolutes[i] * 1
            }
            
            if(signs[i] == false) {
                a += absolutes[i] * -1
            }
            
            
        }
        
        return a
    }
}