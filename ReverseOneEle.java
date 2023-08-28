public class ReverseOneEle {
    public static void main(String[] args) {
        int[] num = {-1, -2, -3, -4};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            int sum = 0;
            for (int j = i; j < num.length; j++) {
                sum += num[j];
                max = Integer.max(sum, max);
            }
        }
        System.out.println(max);
    }
}
