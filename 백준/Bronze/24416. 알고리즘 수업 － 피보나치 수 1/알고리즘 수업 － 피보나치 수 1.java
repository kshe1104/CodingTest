
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int n1 = 0;
    static int n2 = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //횟수
        fib(n);
        fib2(n);
        System.out.println(n1 + " " + n2);
    }

    public static int fib(int n) {
        if (n == 1 || n == 2) {
            n1++;
            return 1;
        } else return fib(n - 1) + fib(n - 2);
    }

    public static int fib2(int n) {
        int[] arr = new int[n + 1];

        arr[1] = arr[2] = 1;

        for (int i = 3; i <= n; i++) {
            n2++;
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }
}
