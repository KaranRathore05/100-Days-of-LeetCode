public class LicenseKey {
    class Solution {
    public String licenseKeyFormatting(String s, int k) {
        char[] chars = s.replace("-","").toCharArray();
        StringBuilder sb = new StringBuilder(chars.length);
        int counter = 0;

        int i = chars.length - 1;
        while(i >= 0){
            sb.append(Character.toUpperCase(chars[i]));
            counter++;
            if(counter == k && i != 0){
                sb.append("-");
                counter = 0;
            }
            i--;
        }

        return sb.reverse().toString();
    }
}
}
