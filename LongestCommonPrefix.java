import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs); // Sort the bros alphabetically

        String str1 = strs[0]; // First bro after sorting
        String str2 = strs[strs.length - 1]; // Last bro after sorting

        int index = 0;

        while (index < str1.length() && index < str2.length()) {
            if (str1.charAt(index) == str2.charAt(index)) {
                index++; // They agree at this char, move on
            } else {
                break; // They start fighting, stop here
            }
        }

        return str1.substring(0, index); // Return the bro-zone (common prefix)
    }

    public static void main(String[] args) {
        String[] bros = {"flower", "flow", "flight"};
        String prefix = longestCommonPrefix(bros);
        System.out.println("Longest Common Prefix: " + prefix);
    }
}
