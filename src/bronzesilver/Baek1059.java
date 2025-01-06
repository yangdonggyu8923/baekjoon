package bronzesilver;

import java.util.Scanner;
import java.util.*;

public class Baek1059 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt(); // 집합 크기
        int [] number = new int [size]; // 배열 입력
        for(int i=0; i<size; i++){
            number[i] = sc.nextInt();
        }
        int n = sc.nextInt(); // n 입력

        Arrays.sort(number); // 배열 정렬
        // n이 어느 index 사이에 있나 구하기 위함
        int index = 0;
        for(int num : number){
            if(n>num) {
                index++;
            }
        }
        // n은 A와 B사이에 있음
        int A = 0;
        if(index==0){ // index가 0이라면
            A=0; // n은 0과 number[0]사이에 있음
        }
        else {
            A = number[index-1];
        }
        int B = number[index];

        int sum = 0;
        // [x,y] 라면
        for(int i=A+1; i<=n; i++){ // x의 범위
            for(int j = n; j<B; j++){ // y의 범위
                if(i==j) // 같으면 좋은 구간이 아님
                    continue;
                else
                    sum++;
            }
        }
        System.out.println(sum);
    }
}
