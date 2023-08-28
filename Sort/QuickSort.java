package Sort;

public class QuickSort {
    public static void main(String[] args) {
        int[] num = {5, -2, 23, 7, 87, -42, 509};
        revArray(num, 0, num.length - 1);

        for (int i : num) {
            System.out.print(i + " ");
        }
    }

    public static void revArray(int[] num, int start, int high) {
        if (start < high) {
            int pIndex = rev(num, start, high);
            revArray(num, start, pIndex - 1);
            revArray(num, pIndex + 1, high);
        }
    }

    public static int rev(int[] num, int start, int high) {
        int pivot = num[start];
        int i = start;
        int j = high;
        while (i < j) {
            while (num[i] <= pivot && i < high) {
                i++;
            }
            while (num[j] > pivot && j > start) {
                j--;
            }
            if (i < j) {
                int temp = num[i];
                num[i] = num[j];
                num[j] = temp;
            }
        }
        int temp = num[start];
        num[start] = num[j];
        num[j] = temp;
        return j;
    }
}
