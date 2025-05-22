public class RevrseVowels {
    
        public String reverseVowels(String s) {
            char[] arr = s.toCharArray();
            int i = 0, j = arr.length - 1;
            while (i < j) {
                while (i < j && !isVowel(arr[i])) i++;
                while (i < j && !isVowel(arr[j])) j--;
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            return new String(arr);
        }
    
        private boolean isVowel(char c) {
            c = Character.toLowerCase(c);
            return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
        }
    }
    

