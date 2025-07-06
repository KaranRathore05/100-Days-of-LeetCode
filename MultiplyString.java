import java.math.BigInteger;

class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        
        BigInteger number1 = new BigInteger(num1);
        BigInteger number2 = new BigInteger(num2);
        
        BigInteger result = number1.multiply(number2);
        
        return result.toString();
    }
}