
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int val = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
        int[] arr = new int[10];

        while (val != 0) {
            arr[val%10]++;
            val/=10;
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
