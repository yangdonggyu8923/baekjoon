package bronzesilver;

import java.util.Scanner;

public class Baek14909 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int count = 0;

        for (String numStr : input) {
            int num = Integer.parseInt(numStr);
            if (num > 0) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();

    }
}
