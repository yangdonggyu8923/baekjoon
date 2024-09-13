package bronzesilver;

import java.util.Scanner;

public class TVSize1297 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int h = sc.nextInt();
        int w = sc.nextInt();

        double x = Math.sqrt((double) (d * d) / (h * h + w * w));
        int height = (int) (h * x);
        int width = (int) (w * x);

        System.out.println(height + " " + width);
    }
}
