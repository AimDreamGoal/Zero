import java.util.PriorityQueue;

public class kthSmallest {
    public static void main(String[] args) {
        int[] num = {7, 10, 4, 3, 20, 15};
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int length = num.length;
        for (int i : num) {
            pq.add(i);
        }
        int small = 4;
        int n = length - small;
        while(n-- > 0) {
            pq.poll();
        }
        System.out.println(pq.poll());
    }
}
