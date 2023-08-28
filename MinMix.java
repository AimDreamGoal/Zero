public class MinMix {
    public static void main(String[] args) {
        int[] num = {22, 14, 8, 17, 35, 3};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i : num) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        System.out.println(max + ":" + min);
    }
}
