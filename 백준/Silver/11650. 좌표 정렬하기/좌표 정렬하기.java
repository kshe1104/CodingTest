

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);

        int n = sr.nextInt(); //테스트 케이스 갯수 입력받기

        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = sr.nextInt(); //좌표들 입력받기
            arr[i][1] = sr.nextInt();
        }

        Arrays.sort(arr,(e1,e2)->{
            if (e1[0] == e2[0]) {
                return e1[1]-e2[1]; //첫번째 값이 같으면 두번째 값 기준으로 오름차순
            }
            else{
                return e1[0] - e2[0]; //아니면 첫번째 값 기준으로 오름차순
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(arr[i][0] + " " + arr[i][1]).append('\n');
        }

        System.out.println(sb);
        
    }
}
