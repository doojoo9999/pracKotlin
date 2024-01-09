class Solution {
    fun solution(numbers: IntArray): Int {
        
        var sum = (0..9).sum()

        for (i in numbers) {
            sum = sum - i    
        }
        
        return sum
    }
}