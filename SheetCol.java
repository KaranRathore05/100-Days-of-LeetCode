public class SheetCol {
    class Solution {
    public int titleToNumber(String col){
        int sum =0;
        int pow =0;
        for(int i = col.length()-1;i>=0;i--){
            int c = col.charAt(i)- 64;
            sum += Math.pow(26, pow++) * c;

        } return sum;
    }
}
}
