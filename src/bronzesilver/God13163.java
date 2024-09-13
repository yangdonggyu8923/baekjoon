package bronzesilver;

import java.util.Scanner;

public class God13163 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<n; i++){
            String[] arr = sc.nextLine().split(" ");
            arr[0] = "god";
            System.out.println(String.join("", arr));
        }
    }
}
