class Solution {
    fun solution(seoul: Array<String>): String {
    val count = seoul.size
    var answer = ""
    for (i in 0..count) {
        if (seoul[i] == "Kim") {
           answer = "김서방은 " + i.toString() + "에 있다";
           break;
        }
    }
        return answer
    }
}