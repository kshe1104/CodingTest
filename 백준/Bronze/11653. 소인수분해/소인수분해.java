
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sr.nextInt();
        if(n==1){
            return;
        }
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                n /= i;
                sb.append(i+"\n");
            }
        }
        System.out.println(sb);
    }
}
