class Solution {
    fun solution(num_list: IntArray): IntArray {
        
        val sortedList = num_list.sorted()
        return sortedList.take(5).toIntArray()
    }
}