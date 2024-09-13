package bronzesilver;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Resistance1076 {
    public static void main(String[] args) {
        String[] color = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        List<String> colorArr = new ArrayList<>();

        for (String num : color) {
            colorArr.add(num);
        }

        Scanner sc = new Scanner(System.in);
        int colorInput1 = colorArr.indexOf(sc.next()) * 10; //첫번째 color
        int colorInput2 = colorArr.indexOf(sc.next()); //두번째 color
        int colorInput3 = colorArr.indexOf(sc.next()); //세번째 color

        long result1 = (long) Math.pow(10,colorInput3);

        int result2 = colorInput1 + colorInput2;

        System.out.println((long)(result1 * result2));
    }
}
