class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        for (q in queries) {
            val i = q[0]
            val j = q[1]
            val result = arr[i]
            arr[i] = arr[j]
            arr[j] = result
        }
        return arr
    }
}