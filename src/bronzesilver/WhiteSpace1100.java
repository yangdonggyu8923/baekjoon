package bronzesilver;

import java.util.Scanner;

public class WhiteSpace1100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] chess = new String[8];
        int count = 0;
        for (int i = 0; i < 8; i++) {
            chess[i] = sc.next();
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0 && chess[i].charAt(j) == 'F') {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
