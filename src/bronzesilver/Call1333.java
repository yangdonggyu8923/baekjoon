package bronzesilver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Call1333 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        ArrayList<Boolean> list = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            for(int l = 0; l < L; l++) {
                list.add(true);
            }

            if(i != N - 1) {
                for(int t = 0; t < 5; t++) {
                    list.add(false);
                }
            }
        }

        int result = 0;

        while(result < list.size()) {
            if(list.get(result) == false)
                break;
            result += D;
        }

        str.append(result);
        System.out.print(str);
        br.close();
    }
}
