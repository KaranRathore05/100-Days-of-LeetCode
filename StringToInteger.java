public class StringToInteger {
    public static int myAtoi(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        final int INT_MAX = Integer.MAX_VALUE;
        final int INT_MIN = Integer.MIN_VALUE;

        int i = 0;
        int n = s.length();

        // Step 1: Skip leading whitespace
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        if (i == n) {
            return 0;
        }

        // Step 2: Check for sign
        int sign = 1;
        if (s.charAt(i) == '+') {
            i++;
        } else if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        }

        // Step 3: Read digits and convert
        long res = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            res = res * 10 + digit;

            if (sign * res <= INT_MIN) {
                return INT_MIN;
            }
            if (sign * res >= INT_MAX) {
                return INT_MAX;
            }

            i++;
        }

        return (int)(res * sign);
    }

    public static void main(String[] args) {
        String input = "   -42";
        int result = myAtoi(input);
        System.out.println("Converted Integer: " + result);
    }
}
