public class MoveAllNegativeNumbersToBeginning {
    public static void main(String[] args) {
        int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int left = 0;
        int mid = 0;
        while (mid != arr.length) {
            if (arr[mid] < 0) {
                int temp = arr[mid];
                arr[mid++] = arr[left];
                arr[left++] = temp;
            } else {
                mid++;
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
