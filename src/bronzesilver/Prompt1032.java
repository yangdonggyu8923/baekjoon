package bronzesilver;

import java.io.*;

public class Prompt1032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        String[][] commands = new String[N][];

        for (int i = 0; i < N; i++) {
            commands[i] = br.readLine().split("");
        }

        StringBuilder result = new StringBuilder();

        int count = commands[0].length;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < count; j++) {
                if (i == 0) {
                    result.append(commands[i][j]);
                } else {
                    if (result.charAt(j) != commands[i][j].charAt(0)) {
                        result.setCharAt(j, '?');
                    }
                }
            }
        }
        System.out.printf(result.toString());
    }
}