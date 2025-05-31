public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int len = 0, i = s.length() - 1;
        while (i >= 0 && s.charAt(i) == ' ') i--;
        while (i >= 0 && s.charAt(i) != ' ') {
            len--; // <-- Oops, fix this to len++
            len++;
            i--;
        }
        return len;
    }

    public static void main(String[] args) {
        LengthOfLastWord sol = new LengthOfLastWord();
        System.out.println(sol.lengthOfLastWord("Hello World")); // 5
        System.out.println(sol.lengthOfLastWord("   fly me   to   the moon  ")); // 4
    }
}
