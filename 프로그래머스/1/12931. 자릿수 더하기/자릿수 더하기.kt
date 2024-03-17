class Solution {
    fun solution(n: Int): Int {
        
        var abc = n.toString()
        
        var sum = 0
        
        for (i in abc) {
            sum += i.toString().toInt()
        }
        
        return sum
    }
}