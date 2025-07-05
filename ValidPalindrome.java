public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {
        String input1 = "A man, a plan, a canal: Panama";
        String input2 = "race a car";

        System.out.println("Input: \"" + input1 + "\" → Output: " + isPalindrome(input1));
        System.out.println("Input: \"" + input2 + "\" → Output: " + isPalindrome(input2));
    }
}
