package bronzesilver;

import java.util.Scanner;

public class Average4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();  // 테스트 케이스 수 입력받기

        for(int i=0; i<c; i++) {
            int[] n = new int[sc.nextInt()]; // 학생 수 입력받기
            int sum = 0; // 학생들의 총 점수
            int avg = 0; // 학생들의 평균 점수
            int standard_count = 0;  // 평균 이상의 학생 수
            float standard_avg = 0;  // 평균 점수보다 높은 학생 수 비율(%)

            // 입력받은 학생 수 만큼을 반복하여 N 배열의 인덱스에 각각 저장 합니다.
            for(int j=0; j<n.length; j++) {
                n[j] = sc.nextInt();  // 입력받은 값을 N 배열에 저장
                sum += n[j]; // 학생들의 총 점수를 sum 변수에 저장
            }

            avg = sum/(n.length); // 총점수/학생수를 계산하여 평균 점수를 avg 변수에 저장

            for(int k=0; k<n.length; k++) {
                if(n[k] > avg) {
                    standard_count++;  // 평균 점수보다 높은(초과) 학생 수를 standard_cnt 변수에 저장
                }
            }

            /*
            소수점 셋째 자리까지 출력 해야하므로 학생 수(standard_cnt)를 float으로 형변환 해준 뒤
            폄균 점수보다 높은 학생 수/총 학생 수를 계산하고 100을 곱해주면
            평균을 넘는 학생들의 비율을 알아낼 수 있습니다.

            이후 마지막으로 String.format을 사용하여 소수점 3자리까지 표시합니다.
            */

            standard_avg = (float)standard_count/n.length * 100;
            System.out.println(String.format("%.3f", standard_avg)+"%");
        }
    }
}
