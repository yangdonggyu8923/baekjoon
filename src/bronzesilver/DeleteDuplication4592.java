package bronzesilver;

import java.util.Scanner;

public class DeleteDuplication4592 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();

            if (n == 0) break;

            int n2 = sc.nextInt();
            System.out.print(n2 + " ");

            for (int i = 0; i < n - 1; i++) {
                int n3 = sc.nextInt();
                if (n2 != n3) {
                    System.out.print(n3 + " ");
                    n2 = n3;
                }
            }
            System.out.println("$");
        }

    }
}
