package bronzesilver;

import java.util.Scanner;

public class AiWatch2530 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int si = sc.nextInt();
        int bun = sc.nextInt();
        int cho = sc.nextInt();
        int ncho = sc.nextInt();

        cho = cho + ncho;
        bun = bun + cho/60;
        cho = cho%60;
        si = si + bun/60;
        bun = bun%60;
        si = si%24;
        System.out.println(si + " " + bun + " " + cho);
    }
}
