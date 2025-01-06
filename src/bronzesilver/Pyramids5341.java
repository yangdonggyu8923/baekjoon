package bronzesilver;

import java.util.Scanner;

public class Pyramids5341 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            int n = sc.nextInt();
            if (n == 0){
                break;
            }
            int sum = 0;
            for (int i = 1; i<n+1; i++){
                sum += i;
            }
            System.out.println(sum);

        }


    }
}
