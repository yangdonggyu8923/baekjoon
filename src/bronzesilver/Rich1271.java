package bronzesilver;

import java.math.BigInteger;
import java.util.Scanner;

public class Rich1271 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger n = in.nextBigInteger();
        BigInteger m = in.nextBigInteger();
        System.out.println(n.divide(m));
        System.out.println(n.remainder(m));
    }
}
