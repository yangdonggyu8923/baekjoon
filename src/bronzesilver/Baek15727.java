package bronzesilver;

import java.io.*;

public class Baek15727 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int L = Integer.parseInt(br.readLine());
        int t;
        if (L % 5 == 0) {
            t = L / 5;
        } else {
            t = L / 5 + 1;
        }
        bw.write(t + "\n");

        br.close();
        bw.close();
    }
}
