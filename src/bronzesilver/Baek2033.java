package bronzesilver;

import java.util.*;

public class Baek2033 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int num=10;

        while(n>num){

            if(n%num >= num/2){
                n=n+num;
            }

            n=n-(n%num);
            num=num*10;
        }

        System.out.println(n);
    }
}