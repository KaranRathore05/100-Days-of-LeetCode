public class Palidrom {
    public class Solution {
        public boolean isPalindrome(int x) {
            // Negative numbers are not palindrome, and if number ends in 0 (but not 0 itself), it's not a palindrome
            if (x < 0 || (x % 10 == 0 && x != 0)) {
                return false;
            }
    
            int reversed = 0;
            while (x > reversed) {
                reversed = reversed * 10 + x % 10;
                x /= 10;
            }
    
            // For even and odd length numbers
            return x == reversed || x == reversed / 10;
        }
    }
    
}
