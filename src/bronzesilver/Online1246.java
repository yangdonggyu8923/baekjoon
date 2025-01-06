package bronzesilver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Online1246 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            arr.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(arr);

        int rs = 0;
        int max = 0;

        for (int i = 0; i < m; i++) {
            int tmp = arr.get(i);
            int tmpsum = 0;

            if (m-i<n){
                tmpsum = tmp * (m-i);
            }else {
                tmpsum = tmp * n;
            }

            if (tmpsum > max) {
                max = tmpsum;
                rs = tmp;
            }
        }
        System.out.println(rs + " " + max);
    }
}
