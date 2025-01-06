package bronzesilver;

import java.util.Scanner;

public class Baek2816 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String[] TV = new String[N];
        String result = "";
        int KBS1_Index = 0;
        int KBS2_Index = 0;
        for(int i=0; i<N; i++) {
            TV[i] = scan.next();
            if(TV[i].equals("KBS1"))
                KBS1_Index = i;
            if(TV[i].equals("KBS2"))
                KBS2_Index = i;
        }

        if(KBS1_Index < KBS2_Index) {
            for(int i=0; i<KBS1_Index; i++)
                result += "1";
            for(int i=0; i<KBS1_Index; i++)
                result += "4";
            for(int i=0; i<KBS2_Index; i++)
                result += "1";
            for(int i=0; i<KBS2_Index - 1; i++)
                result += "4";
        }
        else {
            for(int i=0; i<KBS1_Index; i++)
                result += "1";
            for(int i=0; i<KBS1_Index; i++)
                result += "4";
            for(int i=0; i<KBS2_Index + 1; i++)
                result += "1";
            for(int i=0; i<KBS2_Index; i++)
                result += "4";
        }

        System.out.println(result);
        scan.close();
    }

}
