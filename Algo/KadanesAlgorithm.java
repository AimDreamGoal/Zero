package Algo;

public class KadanesAlgorithm {
    public static void main(String[] args) {
        int N = 5;
        int[] nums = {-1, -2, -3, -4};
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            max = Math.max(sum, max);
            if (sum < 0) {
                sum = 0;
            }
        }
        Long l = 5L;
        int ff = 2;
        System.out.println(l + ff);
    }
}
