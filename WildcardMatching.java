public class WildcardMatching {
    public boolean isMatch(String s, String p) {
        int i = 0, j = 0, starIdx = -1, iIdx = -1;
        while (i < s.length()) {
            if (j < p.length() && (p.charAt(j) == s.charAt(i) || p.charAt(j) == '?')) {
                i++; j++;
            } else if (j < p.length() && p.charAt(j) == '*') {
                starIdx = j;
                iIdx = i;
                j++;
            } else if (starIdx != -1) {
                j = starIdx + 1;
                i = ++iIdx;
            } else {
                return false;
            }
        }
        while (j < p.length() && p.charAt(j) == '*') j++;
        return j == p.length();
    }

    public static void main(String[] args) {
        WildcardMatching sol = new WildcardMatching();
        System.out.println(sol.isMatch("aa", "a*")); // false
        System.out.println(sol.isMatch("aa", "*"));  // true
        System.out.println(sol.isMatch("cb", "?a")); // false
    }
}
