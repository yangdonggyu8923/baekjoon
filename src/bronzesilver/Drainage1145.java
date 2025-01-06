package bronzesilver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Drainage1145 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int count, n;

        List<Integer> num= new ArrayList<>(5);

        for(int i=0;i<5;i++){
            num.add(scanner.nextInt());
        }

        n= Collections.min(num);

        while(true){
            count=0;

            for(int i=0;i<5;i++){
                if(n % num.get(i) == 0){
                    count=count+1;
                }
            }

            if(count>2){
                System.out.println(n);
                break;
            }
            n=n+1;
        }
    }
}