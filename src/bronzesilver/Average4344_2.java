package bronzesilver;

import java.util.Scanner;

public class Average4344_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();

        for(int i=0; i<c; i++) {
            int[] n = new int[sc.nextInt()];
            int sum = 0;
            int avg = 0;
            int standard_count = 0;
            float standard_avg = 0;

            for(int j=0; j<n.length; j++) {
                n[j] = sc.nextInt();
                sum += n[j];
            }

            avg = sum/(n.length);

            for(int k=0; k<n.length; k++) {
                if(n[k] > avg) {
                    standard_count++;
                }
            }
            standard_avg = (float)standard_count/n.length * 100;
            System.out.println(String.format("%.3f", standard_avg)+"%");
        }
    }
}
