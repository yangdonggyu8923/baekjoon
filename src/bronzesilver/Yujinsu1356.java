package bronzesilver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Yujinsu1356 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        String n = br.readLine();

        for (int i = 0; i < n.length(); i++) {
            int tmp1 = 1;
            for (int j = 0; j < i + 1; j++) {
                tmp1 *= n.charAt(j) - '0';
            }
            int tmp2 = 1;
            for (int j = i + 1; j < n.length(); j++) {
                tmp2 *= n.charAt(j) - '0';
            }
            if (tmp1 == tmp2 && n.length() > 1) {
                System.out.print("YES");
                return;
            }
        }
        str.append("NO");
        System.out.print(str);
        br.close();
    }
}
