package bronzesilver;

import java.util.Scanner;

public class RSP4493 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int a = 0;
            int b = 0;
            for (int j = 0; j < n; j++) {
                String s1 = sc.next();
                String s2 = sc.next();
                if (s1.equals("R")) {
                    if (s2.equals("S")) {
                        a++;
                    } else if (s2.equals("P")) {
                        b++;
                    }
                } else if (s1.equals("S")) {
                    if (s2.equals("P")) {
                        a++;
                    } else if (s2.equals("R")) {
                        b++;
                    }
                } else if (s1.equals("P")) {
                    if (s2.equals("R")) {
                        a++;
                    } else if (s2.equals("S")) {
                        b++;
                    }
                }
            }
            if (a > b) {
                System.out.println("Player 1");
            } else if (a < b) {
                System.out.println("Player 2");
            } else {
                System.out.println("TIE");
            }
        }
    }
}
