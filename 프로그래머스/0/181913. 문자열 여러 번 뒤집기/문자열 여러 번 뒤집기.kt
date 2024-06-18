class Solution {
    fun solution(my_string: String, queries: Array<IntArray>): String {
        val charArray = my_string.toCharArray()
        
        for (query in queries) {
            val a = query[0]
            val b = query[1]
            
            var start = a
            var end = b
            
            while (start < end) {
                val temp = charArray[start]
                charArray[start] = charArray[end]
                charArray[end] = temp
                start++
                end--
            }
        }
        
        return String(charArray)
    }
}