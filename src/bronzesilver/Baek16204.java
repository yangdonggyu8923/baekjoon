package bronzesilver;

import java.util.Scanner;
import java.lang.Math;

public class Baek16204 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int rs = Math.min(m, k) + Math.min(n-m, n-k);
        System.out.println(rs);
    }
}
