class Solution {
    fun solution(s: String, skip: String, index: Int): String {
        val answer = StringBuilder()

        for (charS in s) {
            var char2 = charS
            var count = 0

            while (count < index) {
                char2++ 
                if (char2 > 'z') { 
                    char2 = 'a'
                }

                if (char2 !in skip) {
                    count++
                }
            }
            answer.append(char2)
        }

        return answer.toString()
    }
}