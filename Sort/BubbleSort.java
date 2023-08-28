package Sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] num = {12, 45, 85, 32, 89, 39, 69, 44, 42, 1, 6, 8};
        for (int i = num.length; i > 0; i--) {
            for (int j = 1; j < i; j++) {
                if (num[j] < num[j - 1]) {
                    int temp = num[j];
                    num[j] = num[j - 1];
                    num[j - 1] = temp;
                }
            }
        }
        for (int i : num) {
            System.out.print(i + " ");
        }
    }
}
