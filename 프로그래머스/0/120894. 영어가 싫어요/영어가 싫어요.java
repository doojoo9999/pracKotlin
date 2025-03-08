class Solution {
    public long solution(String numbers) {
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        StringBuilder result = new StringBuilder();
        
        int index = 0;
        
        while (index < numbers.length()) {
            for (int i = 0; i < words.length; i++) {
                if (numbers.startsWith(words[i], index)) {
                    result.append(i); 
                    index += words[i].length();
                    break;
                }
            }
        }
        
        return Long.parseLong(result.toString());
    }
}