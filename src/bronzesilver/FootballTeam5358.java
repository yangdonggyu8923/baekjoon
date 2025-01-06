package bronzesilver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class FootballTeam5358 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s;
        while ((s = br.readLine()) != null && !s.isEmpty()) {

            char[] arr = s.toCharArray();
            for (char c : arr) {
                if (c == 'e') sb.append('i');
                else if (c == 'i') sb.append('e');
                else if (c == 'E') sb.append('I');
                else if (c == 'I') sb.append('E');
                else sb.append(c);
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}
