package bronzesilver;

import java.util.Scanner;

public class Rice27294 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int s = sc.nextInt();
        if (s == 0 && t >= 12 && t < 17) {
            System.out.println("320");
        }else {
            System.out.println("280");
        }
    }
}
