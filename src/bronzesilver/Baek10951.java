package bronzesilver;

import java.util.Scanner;

public class Baek10951 {
    public static void main(String args[]){

        Scanner in=new Scanner(System.in);

        while(in.hasNextInt()){

            int a=in.nextInt();
            int b=in.nextInt();
            System.out.println(a+b);

        }
        in.close();
    }
}
