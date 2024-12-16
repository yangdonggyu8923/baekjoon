package bronzesilver;

import java.io.*;


public class Baek28352 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(br.readLine());
        long week=7*24*3600;
        long temp=1;
        for(int i=1; i<=n; i++){
            temp*=i;
        }
        bw.write(temp/week+"");
        bw.flush();
    }
}
