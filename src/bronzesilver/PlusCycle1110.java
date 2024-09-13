package bronzesilver;

import java.util.Scanner;

public class PlusCycle1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int num = n;
        while (true) {
            int a = num / 10;
            int b = num % 10;
            int c = (a + b) % 10;
            num = b * 10 + c;
            count++;
            if (num == n) {
                break;
            }
        }
        System.out.println(count);
    }
}
