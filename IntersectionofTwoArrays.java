import java.util.*;

public class IntersectionofTwoArrays {
    public static void main(String[] args) {
        int[] num = {1, 2, 2, 1};
        int[] num2 = {2, 2};
        List<Integer> ls = new ArrayList<>();
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i : num) {
            mp.put(i, null);
        }
        for (int i : num2) {
            if (mp.containsKey(i) && !ls.contains(i)) {
                ls.add(i);
            }
        }
        ls.stream().forEach(i -> {
            System.out.println(i);
        });
        Object[] inter = ls.toArray();
    }
}
