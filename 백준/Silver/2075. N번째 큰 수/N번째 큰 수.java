
import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(); //출력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;


        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N * N];
        int idx = 0;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[idx++] = Integer.parseInt(st.nextToken());
            }
        }
        Arrays.sort(arr);
        System.out.println(arr[N * N - N]);
    }
}