
import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();


        int n = sr.nextInt();
        ArrayList<Integer> arr1 = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr1.add(sr.nextInt());
        }
        Collections.sort(arr1);

        for (int value : arr1) {
            sb.append(value).append('\n');
        }
        System.out.println(sb);
    }
}
