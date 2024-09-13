package bronzesilver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BinaryAddition1252 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        String s1 = st.nextToken();
        String s2 = st.nextToken();

        BigInteger S1 = new BigInteger(s1, 2);
        BigInteger S2 = new BigInteger(s2, 2);

        BigInteger sum = S1.add(S2);

        str.append(sum.toString(2));

        System.out.print(str);
        br.close();
    }
}
