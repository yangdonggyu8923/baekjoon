package bronzesilver;

import java.util.Scanner;

public class TriangleMemorize10101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a == 60 && b == 60 && c== 60){
            System.out.println("Equilateral");
        } else if (a+b+c == 180) {
            if ( a==b || b==c || c==a ) {
                System.out.println("Isosceles");
            } else if (a!=b && b!=a && c!=a) {
                System.out.println("Scalene");
            }
        }
        else {
            System.out.println("Error");
        }

    }
}
