package bronzesilver;
import java.io.*;

public class Baek10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); //상의 N개 하의 N개

        int rs = 1;

        for (int i = 1; i<=N; i++){
            rs *= i;
        }


        bw.write(rs + "\n");

        bw.flush();
        br.close();
        bw.close();
    }
}
