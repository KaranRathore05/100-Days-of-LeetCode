public class ReverseString{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        for(int i = 0;i<sb.length()/2;i++){
           int front = i;
           int  back = sb.length()-1-i;
           char frnt =sb.charAt(front);
           char bck = sb.charAt(back);
           sb.setCharAt(front,bck);
           sb.setCharAt(back,frnt);
           
        }
        System.out.println(sb);
    }
}