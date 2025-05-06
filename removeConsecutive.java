public class removeConsecutive {
    public class Solution {
        public String removeDuplicates(String s) {
            StringBuilder stack = new StringBuilder();
            for (char ch : s.toCharArray()) {
                int len = stack.length();
                if (len > 0 && stack.charAt(len - 1) == ch) {
                    stack.deleteCharAt(len - 1); // Remove the last character
                } else {
                    stack.append(ch); // Add current character
                }
            }
            return stack.toString();
        }
    }
    
}
