package bronzesilver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Basketball1159 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26];
        int n = Integer.parseInt(br.readLine());
        boolean t = false;
        for (int i = 0; i < n; i++) {
            String name = br.readLine();
            char c = name.charAt(0);
            arr[c - 97]++;
            if (arr[c - 97] == 5) t = true;
        }
        if (t) {
            for (int i = 0; i < 26; i++) {
                if (arr[i] >= 5) System.out.print((char) (i + 97));
            }
        } else {
            System.out.print("PREDAJA");
        }
    }
}
