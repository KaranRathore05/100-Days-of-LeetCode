public class lengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        String current = "";
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            String ch = String.valueOf(s.charAt(i));

            if (current.contains(ch)) {
                int index = current.indexOf(ch);
                current = current.substring(index + 1);
            }

            current += ch;
            if (current.length() > max) {
                max = current.length();
            }
        }

        return max;
    }
}

