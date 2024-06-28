class Solution {
    fun solution(a: Int, b: Int): Int {
        val ab = "$a$b"
        val ba = "$b$a"
        
        return if (ab.toInt() >= ba.toInt()) ab.toInt() else ba.toInt()
    }
}