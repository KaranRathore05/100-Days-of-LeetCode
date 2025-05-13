class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while(i < word1.length() || i < word2.length()) {
            if(i < word1.length()) {
                result.append(word1.charAt(i));
            }
            if(i < word2.length()) {
                result.append(word2.charAt(i));
            }
            i++;
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        String word1 = "abc";
        String word2 = "pqrs";
        
        String merged = solution.mergeAlternately(word1, word2);
        System.out.println("Merged string: " + merged);
    }
}
