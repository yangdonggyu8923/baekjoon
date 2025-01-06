package bronzesilver;

import java.util.Scanner;

public class Compare4101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a>b){
                System.out.println("Yes");
            } else if (a<b) {
                System.out.println("No");
            } else if (a==0 && b==0){
                break;
            } else {
                System.out.println("No");
            }
        }
    }
}
