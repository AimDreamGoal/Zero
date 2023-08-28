public class ZeroAndOne {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 1, 0, 0, 0, 0};
        int i = 0;
        int r = arr.length-1;
        while(i < r) {
            if (arr[i] == 0) {
                i++;
            } else {
                int temp = arr[i];
                arr[i] = arr[r];
                arr[r--] = temp;
            }
        }
        for (int n : arr) {
            System.out.print(n);
        }
    }
}
