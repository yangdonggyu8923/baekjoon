package bronzesilver;

import java.util.Scanner;

public class LineNumber4470 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i=0; i<n; i++){
            System.out.println(i+1+". "+sc.nextLine());
        }
    }
}
