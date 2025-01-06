package bronzesilver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek2139 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] mArr = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30 };

        while (true) {
            String input = br.readLine();
            String[] parts = input.split(" ");

            int day = Integer.parseInt(parts[0]);
            int month = Integer.parseInt(parts[1]);
            int year = Integer.parseInt(parts[2]);

            if(day == 0 && month == 0 && year == 0) {
                break;
            }

            int totalDay = 0;
            boolean isLeapYear = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));

            if(isLeapYear && month > 2) {
                totalDay++;
            }

            for(int i = 0; i < month; i++) {
                totalDay += mArr[i];
            }

            totalDay += day;

            System.out.println(totalDay);
        }
        br.close();
    }
}