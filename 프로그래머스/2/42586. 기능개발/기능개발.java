import java.util.*;

public class Solution {
    public Queue<Integer> solution(int[] progress, int[] speeds) {
        Queue<Integer> days = new LinkedList<>(); // 배포당 기능 수
        Queue<Integer> remainingDays = new LinkedList<>(); // 각 기능의 남은 개발일

        // 각 작업이 완료되는 데 걸리는 일수 계산
        for (int i = 0; i < progress.length; i++) {
            int remainingWork = 100 - progress[i]; // 남은 작업량
            int requiredDays = (int) Math.ceil((double) remainingWork / speeds[i]); // 작업 완료까지의 일수
            remainingDays.offer(requiredDays);
        }

        while (!remainingDays.isEmpty()) {
            int deployDay = remainingDays.poll(); // 첫 번째 기능의 배포일
            int count = 1; // 배포될 기능 개수

            // 같은 날 배포될 기능 확인
            while (!remainingDays.isEmpty() && remainingDays.peek() <= deployDay) {
                remainingDays.poll(); // 배포 가능하므로 제거
                count++;
            }

            days.offer(count); // 해당 배포일의 기능 개수 저장
        }

        return days;
    }

}
