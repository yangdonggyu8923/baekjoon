package bronzesilver;

import java.util.Scanner;

public class VacationHomework5532 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int korean = 0;
        int math = 0;
        if(a%c==0){
            korean=l-(a/c);
        }else {
            korean=l-(a/c+1);
        }
        if(b%d==0){
            math=l-(b/d);
        }else {
            math=l-(b/d+1);
        }
        System.out.println(Math.min(korean,math));

    }
}
