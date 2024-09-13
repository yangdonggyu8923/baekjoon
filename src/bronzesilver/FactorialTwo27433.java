package bronzesilver;

import java.util.Scanner;

public class FactorialTwo27433 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong();
        Long a = 1L;
        for(int i=1; i<=n; i++){
            a *= i;
        }
        System.out.println(a);
    }
}
