class Solution {
    fun solution(my_string: String, s: Int, e: Int): String {
        val a = my_string.substring(s, e + 1).reversed()
        return my_string.substring(0, s) + a + my_string.substring(e + 1)
    }
}