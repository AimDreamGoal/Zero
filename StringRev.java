public class StringRev {
    public static void main(String[] args) {
        String s = "12345";
        char[] ch = s.toCharArray();
        rev(ch, 0,s.length()-1);
        for (char c : ch) {
            System.out.print(c+" ");
        }
    }
    public static void rev(char[] ch, int left, int right) {
        if (left>right) {
            return;
        }
        char c = ch[left];
        ch[left++] = ch[right];
        ch[right--] = c;
        rev(ch, left,right);
    }
}
