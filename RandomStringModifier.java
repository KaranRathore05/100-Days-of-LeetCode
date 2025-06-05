public class RandomStringModifier {
    public String modifyString(String s) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '?') {
                for (char ch = 'a'; ch <= 'z'; ch++) {
                    if ((i > 0 && arr[i - 1] == ch) || (i < arr.length - 1 && arr[i + 1] == ch)) {
                        continue;
                    }
                    arr[i] = ch;
                    break;
                }
            }
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        RandomStringModifier obj = new RandomStringModifier();
        String input = "?zs";
        String output = obj.modifyString(input);
        System.out.println(output);
    }
}
