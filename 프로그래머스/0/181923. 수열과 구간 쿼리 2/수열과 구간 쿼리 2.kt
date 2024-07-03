class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        val answer = mutableListOf<Int>()
        
        for (query in queries) {
            val (s, e, k) = query
            var minValue = Int.MAX_VALUE
            var found = false
            
            for (i in s..e) {
                if (arr[i] > k && arr[i] < minValue) {
                    minValue = arr[i]
                    found = true
                }
            }
            
            if (found) {
                answer.add(minValue)
            } else {
                answer.add(-1)
            }
        }
        
        return answer.toIntArray()
    }
}
