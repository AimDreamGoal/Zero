package Algo;

public class TortoiseAndHareAlgorithm {
    public static void main(String[] args) {
        int[] num = {1, 3, 4, 2, 2};
        System.out.println(algo(num));
    }

    public static int algo(int[] nums) {
        int slow = 0;
        int fast = 0;
        int count = 0;
        while (true) {
            slow = nums[slow];
            fast = nums[nums[fast]];
            if (slow == fast) break;
        }
        while (true) {
            slow = nums[slow];
            count = nums[count];
            if (slow == count)
                break;
        }
        return count;
    }
}
