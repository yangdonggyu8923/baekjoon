package bronzesilver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Baek2061 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        BigInteger K = new BigInteger(input[0]);
        int L = Integer.parseInt(input[1]);


        for(int i = 2; i < L; i++) {
            BigInteger num = BigInteger.valueOf(i);
            if(K.mod(num).equals(BigInteger.ZERO)) {
                System.out.println("BAD " + i);
                return;
            }
        }
        System.out.println("GOOD");
    }
}