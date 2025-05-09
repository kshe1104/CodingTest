
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        int n = Integer.parseInt(br.readLine());


        ArrayList<Integer> arr1 = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr1.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(arr1);

        for (int value : arr1) {
            sb.append(value).append('\n');
        }
        System.out.println(sb);
    }
}
