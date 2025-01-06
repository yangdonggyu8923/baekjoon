package bronzesilver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RealSpace1350 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long count = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        long size = Long.parseLong(br.readLine());
        for(int i = 0; i < n; i++) {
            long file = Long.parseLong(st.nextToken());

            if(file != 0) {
                count += (file / size);
                if(file % size != 0) {
                    count++;
                }
            }
        }
        System.out.println(size * count);
    }

}