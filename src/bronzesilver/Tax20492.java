package bronzesilver;

import java.util.Scanner;

public class Tax20492 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = (int) (n * 0.22);
        int b = (int) (n * 0.8);
        int c = (int) ((n * 0.2) - ((n - b) * 0.22));
        System.out.print(n - a + " " + (b + c));
    }
}
