class Solution {
    fun solution(n: Int): Int {
        var sum: Int = 0
        for (i in 1 .. n+1){
        if( n%i == 0){
            sum = sum + i
        }            
        }
    return(sum)
    }
}