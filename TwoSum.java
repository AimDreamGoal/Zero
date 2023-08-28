import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        List<Integer> ls = new ArrayList<>();
        while (size-- > 0) {
            ls.add(sc.nextInt());
        }
        int target = sc.nextInt();
        System.out.println(Arrays.asList(ls));
        twoSum(ls, target);
    }

    public static void twoSum(List<Integer> ls, int tar) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < ls.size(); i++) {
            int dif = tar - ls.get(i);
            if (mp.containsKey(dif)) {
                System.out.println(mp.get(dif) + " : " + i);
            } else {
                mp.put(ls.get(i), i);
            }
        }
    }
}
