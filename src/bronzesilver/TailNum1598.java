package bronzesilver;

import java.util.Scanner;

public class TailNum1598 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt() - 1;
        int b = sc.nextInt() - 1;

        int rs = 0;

        rs += Math.abs(a / 4 - b / 4);
        rs += Math.abs(a % 4 - b % 4);

        System.out.println(rs);
    }
}
