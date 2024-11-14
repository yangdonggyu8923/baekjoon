package bronzesilver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baek1773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        boolean[] isExploded = new boolean[C+1];
        int count = 0;

        for (int i = 0; i < N; i++) {
            int period = Integer.parseInt(br.readLine());

            if(!isExploded[period]){
                for(int j=period; j<=C; j+=period){
                    if(!isExploded[j]){
                        isExploded[j]=true;
                        count++;
                    }
                }
            }
        }

        bw.write(count+"\n");

        br.close();
        bw.close();
    }
}
