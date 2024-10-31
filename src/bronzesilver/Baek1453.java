package bronzesilver;


import java.util.Scanner;

public class Baek1453 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int no = 0;
        int[] cpu = new int[100];

        for(int i = 0; i < n; i++){
            int per = sc.nextInt();

            if(cpu[per - 1] == 0){
                cpu[per - 1]++;
            }else{
                no++;
            }
        }
        System.out.println(no);

        sc.close();
    }
}
