import java.util.HashMap;
import java.util.Map;

public class CountPairsWithGivenSum {
    public static void main(String[] args) {
        int[] num = {12, 45, 85, 32, 89, 39, 69, 44, 42, 1, 1, 6, 8};
        int sum = 14;
        // N2
        int count = 0;
        for (int i = 0; i<num.length; i++) {
            for (int j =i+1; j<num.length; j++) {
                if (num[i]+num[j] ==sum) {
                    count++;
                }
            }
        }
//        System.out.println(count);
        Map<Integer, Integer> mp1 = new HashMap<>();
        for (int i : num) {
            if (mp1.containsKey(i)) {
                mp1.put(i, mp1.get(i)+1);
            } else {
                mp1.put(i, 0);
            }
        }
        for (Map.Entry<Integer, Integer> m : mp1.entrySet()) {
            System.out.println(m.getKey()+ " " + m.getValue());
        }
    }
}
