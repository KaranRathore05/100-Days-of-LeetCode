public class LongestPalindromicSubstring {
    public static String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            int odd = expandAroundCenter(s, i, i);
            int even = expandAroundCenter(s, i, i + 1);
            int max_len = Math.max(odd, even);

            if (max_len > end - start) {
                start = i - (max_len - 1) / 2;
                end = i + max_len / 2;
            }
        }

        return s.substring(start, end + 1);        
    }

    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    public static void main(String[] args) {
        String input1 = "babad";
        String input2 = "cbbd";

        System.out.println("Input: \"" + input1 + "\" → Output: " + longestPalindrome(input1));
        System.out.println("Input: \"" + input2 + "\" → Output: " + longestPalindrome(input2));
    }
}
 