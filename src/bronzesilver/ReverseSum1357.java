package bronzesilver;

import java.util.Scanner;
public class ReverseSum1357 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder sbnum1 = new StringBuilder(sc.next());
        StringBuilder sbnum2 = new StringBuilder(sc.next());

        String revnum1 = sbnum1.reverse().toString();
        String revnum2 = sbnum2.reverse().toString();

        int num1 = Integer.parseInt(revnum1);
        int num2 = Integer.parseInt(revnum2);

        StringBuilder sbresult = new StringBuilder(String.valueOf(num1 + num2));

        int result = Integer.parseInt(sbresult.reverse().toString());
        System.out.println(result);
    }
}
