class Solution {
    fun solution(s: String): Boolean {
        if(s.length == 4 || s.length == 6) {
            for ( i in s) {
                if (!i.isDigit()) {
                    return false
                }
            }
            
            return true
        }
        return false
    }
    
}