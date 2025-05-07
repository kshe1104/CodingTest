
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);

        int n = sr.nextInt();

        int count = 0;

        while (n > 0) {
            if (n % 5 == 0) { //5로 나눴을 때 나머지가 0이아니라면 -3해주기
                count += (n / 5);
                System.out.println(count);
                return;
            }if(n<3){
                System.out.println("-1");
                return;
            }
            n -= 3;
            count++;
        }
        System.out.println(count);
    }
}