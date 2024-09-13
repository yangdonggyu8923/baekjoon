package bronzesilver;

import java.util.Scanner;

public class Word1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next().toUpperCase();
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'A']++;
        }
        int max = -1;
        char c = '?';
        for (int i = 0; i < count.length; i++) {
            if (count[i] > max) {
                max = count[i];
                c = (char) (i + 'A');
            } else if (count[i] == max) {
                c = '?';
            }
        }
        System.out.println(c);
    }
}
