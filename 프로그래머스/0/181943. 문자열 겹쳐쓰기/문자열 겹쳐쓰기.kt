class Solution {
    fun solution(my_string: String, overwrite_string: String, s: Int): String {
        val sb = StringBuilder(my_string)
        sb.replace(s, s + overwrite_string.length, overwrite_string)
        return sb.toString()
    }
}