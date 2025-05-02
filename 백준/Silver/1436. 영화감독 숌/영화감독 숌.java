
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);

        int n = sr.nextInt();

        int start = 666;
        int count = 1;
        while (count != n) {
            start++;
            if (String.valueOf(start).contains("666")) {
                count++;
            }
        }
        System.out.println(start);
    }
}
