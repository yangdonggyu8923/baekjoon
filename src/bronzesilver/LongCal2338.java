package bronzesilver;

import java.math.BigInteger;
import java.util.Scanner;

public class LongCal2338 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger a = in.nextBigInteger();
        BigInteger b = in.nextBigInteger();

        System.out.println(a.add(b));
        System.out.println(a.subtract(b));
        System.out.print(a.multiply(b));
    }
}
