
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        int count = 0;

        for (int j = 0; j < n; j++) { //n번 반복
            int k = sr.nextInt(); //수 입력받기
            int count2 = 0;//약수라면 올라갈 카운트값

            for (int i = 1; i <= k; i++) {
                if (k % i == 0) { //약수라면 카운트2 올라감
                    count2++;
                }
            }
            if (count2 == 2) {
                count++;
            }
        }
        System.out.println(count);

    }
}
