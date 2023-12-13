class Solution {
    fun solution(x: Int, n: Int): LongArray {
        var answer = longArrayOf()
        x in -10000000 .. 10000000
        n in 0 .. 1000

        for (i in 1 .. n){
            var result = x.toLong() * i
            
            answer += result
        }
        
        return answer
    }
}