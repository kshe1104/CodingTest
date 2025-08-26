
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
public static void main(String[] args)throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    int Max = -1000001;
    int min = 1000001;

    while (st.hasMoreTokens()) {
        int val = Integer.parseInt(st.nextToken());
        if (val > Max) {
            Max = val;
        }
        if (val < min) {
            min = val;
        }
    }
    System.out.println(min + " " + Max);
}
}