
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;


public class Main {
    public static void main(String[] args) throws IOException {
        //빠른 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //빠른 출력
        StringBuilder sb = new StringBuilder();

        PriorityQueue<Integer> min_Heap = new PriorityQueue<>();

        int test = Integer.parseInt(br.readLine());//test 갯수

        for (int i = 0; i < test; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num != 0) {
                min_Heap.add(num);
            }
            else{
                sb.append(min_Heap.isEmpty() ? 0 : min_Heap.poll()).append('\n');
            }
        }
        System.out.println(sb);
    }
}
