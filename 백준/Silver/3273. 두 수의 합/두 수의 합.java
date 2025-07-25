
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        int[] arr = new int[num];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int result = Integer.parseInt(br.readLine());

        Arrays.sort(arr);
        int count = 0;
        int left = 0;
        int right = num-1;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == result) {
                count++;
                left++;
                right--;
            } else if (sum < result) {
                left++;
            }else right--;
        }
        System.out.println(count);
    }
    
}