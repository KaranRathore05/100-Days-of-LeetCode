import java.util.*;

public class TextJustification {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while (i < words.length) {
            int len = words[i].length();
            int j = i + 1;
            while (j < words.length && len + words[j].length() + (j - i) <= maxWidth) {
                len += words[j].length();
                j++;
            }
            StringBuilder sb = new StringBuilder();
            int gaps = j - i - 1;
            if (j == words.length || gaps == 0) {
                for (int k = i; k < j; k++) {
                    sb.append(words[k]);
                    if (k < j - 1) sb.append(" ");
                }
                while (sb.length() < maxWidth) sb.append(" ");
            } else {
                int space = (maxWidth - len) / gaps;
                int extra = (maxWidth - len) % gaps;
                for (int k = i; k < j; k++) {
                    sb.append(words[k]);
                    if (k < j - 1) {
                        for (int s = 0; s < space + (k - i < extra ? 1 : 0); s++) {
                            sb.append(" ");
                        }
                    }
                }
            }
            res.add(sb.toString());
            i = j;
        }
        return res;
    }

    public static void main(String[] args) {
        TextJustification sol = new TextJustification();
        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        List<String> result = sol.fullJustify(words, 16);
        for (String line : result) {
            System.out.println("\"" + line + "\"");
        }
    }
}
