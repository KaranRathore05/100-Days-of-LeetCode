public class ReverseString {
    public void reverseString(char[] s) {
        int i=0, j=s.length-1;
        while(i<j){
            char t=s[i];
            s[i]=s[j];
            s[j]=t;
            i++; j--;
        }
    }
    public static void main(String[] args) {
        ReverseString obj = new ReverseString();
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        obj.reverseString(s);
        System.out.println(s); // Output: ['o', 'l', 'l', 'e', 'h']
    }
}
 
