package bronzesilver;

import java.util.Arrays;
import java.util.Scanner;

public class MinMax10818 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr);
        System.out.print(arr[0] + " " + arr[n - 1]);
    }
}
