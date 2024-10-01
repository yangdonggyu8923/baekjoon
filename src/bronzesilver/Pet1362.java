package bronzesilver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Pet1362 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int o = 0;
        int w = 0;

        int scenario = 0;
        String petState = "";
        int gameState = 0;

        while( true )
        {
            String s = br.readLine();
            
            if( s.equals("# 0") ) {
                bw.write(scenario + " " + petState + "\n") ;
                gameState = 0;
                continue;
            } else if (s.equals("0 0")) {
                break;
            }

            if(gameState == 0) {
                StringTokenizer st = new StringTokenizer(s);
                o = Integer.parseInt(st.nextToken());
                w = Integer.parseInt(st.nextToken());
                gameState = 1;
                scenario++;
            } else if (gameState == 1) {
                StringTokenizer st = new StringTokenizer(s);
                String action = st.nextToken();
                int n = Integer.parseInt(st.nextToken());

                if(action.equals("E")) {
                    w -= n;
                } else if (action.equals("F")) {
                    w += n;
                }
            } else {
                continue;
            }

            if( o/2 < w && w < o*2 ) {
                petState = ":-)";
            } else if ( w <= 0) {
                petState = "RIP";
                gameState = -1;
            } else {
                petState = ":-(";
            }

        }
        bw.flush();
        bw.close();
        br.close();
    }
}
