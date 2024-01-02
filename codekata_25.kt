class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        var answer = intArrayOf()

        
        for (i in 0 until arr.size){ 
            if(arr[i] % divisor == 0) {
                answer = answer.plus(arr[i])
            } 
        }

        if (answer.size == 0){
            answer = intArrayOf(-1)
        }
        return answer.sorted().toIntArray()
    }
}