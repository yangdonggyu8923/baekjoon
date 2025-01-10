package bronzesilver;

import java.util.*;

public class Baek8979 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        List<int[]> countries = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int country = sc.nextInt();
            int gold = sc.nextInt();
            int silver = sc.nextInt();
            int bronze = sc.nextInt();
            countries.add(new int[]{country, gold, silver, bronze});
        }

        countries.sort((a, b) -> {
            if (b[1] != a[1]) return b[1] - a[1];
            if (b[2] != a[2]) return b[2] - a[2];
            return b[3] - a[3];
        });

        int rank = 1;
        for (int i = 0; i < countries.size(); i++) {
            if (i > 0 && !isSameRank(countries.get(i), countries.get(i - 1))) {
                rank = i + 1;
            }

            if (countries.get(i)[0] == k) {
                System.out.println(rank);
                break;
            }
        }
    }

    private static boolean isSameRank(int[] a, int[] b) {
        return a[1] == b[1] && a[2] == b[2] && a[3] == b[3];
    }
}
