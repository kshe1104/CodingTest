
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);

        int n = sr.nextInt();
        Integer[] a = new Integer[n];
        Integer[] b = new Integer[n];

        for (int i = 0; i < n; i++) {
            a[i] = sr.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sr.nextInt();
        }

        Arrays.sort(b);
        Arrays.sort(a, Collections.reverseOrder());

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i] * b[i];
        }

        System.out.println(sum);
    }

}
