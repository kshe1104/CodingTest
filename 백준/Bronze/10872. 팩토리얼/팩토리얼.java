
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        if(n==0) result = 1;
        System.out.println(result);
    }
}
