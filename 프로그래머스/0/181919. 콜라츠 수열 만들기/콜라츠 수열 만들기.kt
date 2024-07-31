class Solution {
    fun solution(n: Int): IntArray {
        val a = mutableListOf<Int>()
        var b = n
        
        while (b != 1) {
            a.add(b)
            if( b % 2 == 0) {
                b /= 2
            } else {
                b = 3 * b + 1
            }
        }
        
        a.add(1)
        
        return a.toIntArray()
        
    }
}