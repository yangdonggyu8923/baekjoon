package bronzesilver;

import java.util.Scanner;

public class Sum8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        for(int i=1; i<=n; i++){
            a += i;
        }
        System.out.println(a);
    }
}
