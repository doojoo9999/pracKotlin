class Solution {
    fun solution(a: Int, b: Int, c: Int, d: Int): Int {
        val dice = listOf(a, b, c, d)
        val frequency = dice.groupingBy { it }.eachCount()

        return when (frequency.size) {
            1 -> { 
            1111 * dice[0]
            }
            2 -> {
            val (x, y) = frequency.keys.toList()
            if (frequency[x] == 3 || frequency[y] == 3) { 
                (10 * (if (frequency[x] == 3) x else y) + (if (frequency[x] == 1) x else y)).let { it * it }
            } else {
                (x + y) * Math.abs(x - y)
            }
            }
            3 -> { 
            val (x, y, z) = frequency.keys.toList()
            if (frequency[x] == 2) {
                y * z
            } else if (frequency[y] == 2) {
                x * z
            } else {
                x * y
            }
            }
            4 -> { 
            dice.minOrNull() ?: 0
            }
            else -> 0
    }
}
}