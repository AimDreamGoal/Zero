package Sort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] num = {12, 45, 85, 32, 89, 39, 69, 44, 42, 1, 6, 8};
        for (int i = 0; i < num.length; i++) {
            int index = i;
            for (int j = i; j < num.length; j++) {
                if (num[j] < num[index]) {
                    index = j;
                }
            }
            int temp = num[index];
            num[index] = num[i];
            num[i] = temp;
        }
        for (int i : num) {
            System.out.print(i + " ");
        }
    }

    public static void recursive(int[] arr, int n) {
        if (n <= 1) {
            return;
        }
        recursive(arr, n - 1);
    }
}
