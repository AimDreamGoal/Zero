package Sort;

import java.util.*;

public class MergeSort {
    public static void main(String[] args) {
        int[] num = {5, 2, 3, 1};
        divide(num, 0, num.length - 1);
        for (int i : num) {
            System.out.print(i + " ");
        }
    }

    public static void divide(int[] num, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        divide(num, low, mid);
        divide(num, mid + 1, high);
        conqure(num, low, mid, high);
    }

    public static void conqure(int[] num, int low, int mid, int high) {
        List<Integer> ls = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        while (left <= mid && right <= high) {
            if (num[left] <= num[right]) {
                ls.add(num[left]);
                left++;
            } else {
                ls.add(num[right]);
                right++;
            }
        }
        while (left <= mid) {
            ls.add(num[left]);
            left++;
        }
        while (right <= high) {
            ls.add(num[right]);
            right++;
        }
        for (int i = low; i <= high; i++) {
            num[i] = ls.get(i - low);
        }
    }
}
