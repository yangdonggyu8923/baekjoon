package bronzesilver;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek21964 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[] S = br.readLine().toCharArray();

        for (int i = N-5; i < N; i++){
            System.out.print(S[i]);
        }

        br.close();
    }
}
