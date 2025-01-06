package bronzesilver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EasyProblem1292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= b; i++) {
            for (int j = 0; j < i; j++) {
                list.add(i);
            }
        }
        int sum = 0;
        for (int i = a - 1; i < b; i++) {
            sum += list.get(i);
        }
        System.out.println(sum);
    }
}
