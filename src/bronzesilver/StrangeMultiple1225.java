package bronzesilver;

import java.util.Scanner;

public class StrangeMultiple1225 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        long rs = 0;
        for(int i =0; i<s1.length(); i++){
            for(int j=0; j<s2.length(); j++){
              rs += (s1.charAt(i)-'0')*(s2.charAt(j)-'0');
            }
        }
        System.out.println(rs);
    }
}
