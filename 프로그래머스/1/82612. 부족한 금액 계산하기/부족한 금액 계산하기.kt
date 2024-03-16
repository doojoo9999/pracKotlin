class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        
        var total: Long = 0
        
        for (i in 1..count) {
            total += price.toLong() * i
        }
        
        val now = total - money
        
        return if (now > 0) {now.toLong()}
        else 0L
    }
}