package Sort;

public class insertionSort {
    public static void main(String[] args) {
        int[] num = {12, 45, 85, 32, 89, 39, 69, 44, 42, 1, 6, 8};
//        for (int i=1; i<num.length; i++) {
//            for (int j=i; j>0; j--) {
//                if (num[j] < num[j-1]) {
//                    int temp = num[j];
//                    num[j] = num[j-1];
//                    num[j-1] = temp;
//                }
//            }
//        }
        rev(num, 1, num.length);
        for (int i : num) {
            System.out.print(i + " ");
        }
    }

    public static void rev(int[] num, int n, int length) {
        if (n == length) {
            return;
        }
        int j = n;
        while (j > 0) {
            if (num[j] < num[j - 1]) {
                int temp = num[j];
                num[j] = num[j - 1];
                num[j - 1] = temp;
            }
            j--;
        }
        n++;
        rev(num, n, length);
    }
}
