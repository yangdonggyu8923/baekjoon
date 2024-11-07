package bronzesilver;

import java.util.Scanner;

public class Baek1712 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (c <= b) {
            System.out.println("-1");
        }
        else {
            System.out.println((a/(c-b))+1);
        }
    }
}
