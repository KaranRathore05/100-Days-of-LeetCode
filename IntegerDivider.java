public class IntegerDivider {
    public int divide(int dividend, int divisor) {
        // If both are equal, the result is 1
        if (dividend == divisor) {
            return 1;
        }

        // Handle overflow: abs(MIN_VALUE) overflows int
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Determine the sign of the result
        int sign = 1;
        if ((dividend < 0) ^ (divisor < 0)) {
            
            sign = -1;
        }

        // Convert to long to handle edge cases
        long n = Math.abs((long) dividend);
        long d = Math.abs((long) divisor);
        long quotient = 0;

        // Use bit shifting to perform division
        while (n >= d) {
            int count = 0;
            while (n >= (d << (count + 1))) {
                count++;
            }
            quotient += 1L << count;
            n -= d << count;
        }

        quotient = sign * quotient;

        // Clamp result within int range
        if (quotient > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (quotient < Integer.MIN_VALUE) return Integer.MIN_VALUE;

        return (int) quotient;
    }

    public static void main(String[] args) {
        IntegerDivider divider = new IntegerDivider();
        System.out.println(divider.divide(10, 3));   // Output: 3
        System.out.println(divider.divide(7, -3));   // Output: -2
        System.out.println(divider.divide(-2147483648, -1)); // Output: 2147483647 (clamped)
    }
}
