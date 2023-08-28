public class zeroOneTwo {
    public static void main(String[] args) {
        int[] num = {2, 0, 1,2,0,1,2,0};
        int left = 0;
        int right = num.length-1;
        int mid = 0;
        while(left<right) {
            if (num[left]==0) {
                left ++;
            } else if (num[left] ==1) {
                int temp = num[left];
                num[left] = num[mid];
                num[mid++] = temp;
            } else if (num[left] ==2) {
                int temp = num[left];
                num[left] = num[right];
                num[right--] = temp;
            }
        }
        for (int i : num) {
            System.out.println(i);
        }
    }
}
