package bronzesilver;
import java.util.Scanner;

public class CYsClock12840 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 초기 시간 입력 받기
        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();

        // 초기 시간을 초 단위로 변환
        long currentTimeInSeconds = h * 3600 + m * 60 + s;

        // 쿼리 개수 입력 받기
        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            int T = sc.nextInt();

            if (T == 1) {
                // c초 앞으로 돌리기
                int c = sc.nextInt();
                currentTimeInSeconds = (currentTimeInSeconds + c) % 86400; // 하루는 86400초
            } else if (T == 2) {
                // c초 뒤로 돌리기
                int c = sc.nextInt();
                currentTimeInSeconds = (currentTimeInSeconds - c) % 86400;
                if (currentTimeInSeconds < 0) {
                    currentTimeInSeconds += 86400; // 음수일 때는 하루를 더해줌
                }
            } else if (T == 3) {
                // 현재 시간 출력
                int hResult = (int) (currentTimeInSeconds / 3600);
                int mResult = (int) ((currentTimeInSeconds % 3600) / 60);
                int sResult = (int) (currentTimeInSeconds % 60);
                System.out.println(hResult + " " + mResult + " " + sResult);
            }
        }
    }
}
