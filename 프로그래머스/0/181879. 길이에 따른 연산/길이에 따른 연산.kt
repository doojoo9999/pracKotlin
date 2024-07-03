class Solution {
    fun solution(num_list: IntArray): Int {
        var sum = 0
        var product = 1
        
        for (num in num_list) {
            sum += num
            product *= num
        }
        
        return if (num_list.size >= 11) sum else product
    }
}