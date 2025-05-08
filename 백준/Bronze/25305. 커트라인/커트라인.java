
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);

        int n = sr.nextInt();
        int k = sr.nextInt();

        int[] award = new int[n];
        for (int i = 0; i < n; i++) {
            award[i] = sr.nextInt();
        }
        Arrays.sort(award);
        System.out.println(award[n-k]);
    }
}
