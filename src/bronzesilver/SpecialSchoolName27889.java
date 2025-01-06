package bronzesilver;

import java.util.Scanner;

public class SpecialSchoolName27889 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        if (a.equals("NLCS")){
            System.out.println("North London Collegiate School");
        } else if (a.equals("BHA")) {
            System.out.println("Branksome Hall Asia");
        } else if (a.equals("KIS")) {
            System.out.println("Korea International School");
        } else {
            System.out.println("St. Johnsbury Academy");
        }
    }
}
