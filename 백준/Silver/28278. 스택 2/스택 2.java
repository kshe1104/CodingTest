import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine()); // 명령어 개수
        StringTokenizer st;
        
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int cmd = Integer.parseInt(st.nextToken());

            if (cmd == 1) { // push X
                stack.push(Integer.parseInt(st.nextToken()));
            } else if (cmd == 2) { // pop
                sb.append(stack.isEmpty() ? "-1\n" : stack.pop() + "\n");
            } else if (cmd == 3) { // size
                sb.append(stack.size()).append("\n");
            } else if (cmd == 4) { // empty
                sb.append(stack.isEmpty() ? "1\n" : "0\n");
            } else if (cmd == 5) { // top
                sb.append(stack.isEmpty() ? "-1\n" : stack.peek() + "\n");
            }
        }

        System.out.print(sb); // 한 번에 출력
    }
}
