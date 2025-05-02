import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

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
