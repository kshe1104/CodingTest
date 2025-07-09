

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); //정답을 위한 리스트
        Scanner sr = new Scanner(System.in); //입력
        Queue<Integer> queue = new LinkedList<>(); //큐를활용 ->LinkedList
        int num = sr.nextInt(); //숫자 갯수
        int k = sr.nextInt(); //뽑을 숫자 갯수

        for (int i = 1; i <= num; i++) {
            queue.offer(i);//큐에 숫자 전부 넣기
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<");

        while (queue.size() > 1) {
            for (int i = 0; i < k - 1; i++) {
                queue.offer(queue.poll());
            }
            sb.append(queue.poll()).append(", ");
        }

        sb.append(queue.poll()).append(">");
        System.out.println(sb);

    }

}
