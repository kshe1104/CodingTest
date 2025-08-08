
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] arr; // 삼각형을 입력받을 2차원 배열
    static Integer[][] dp; // 경로합을 갖을 DP배열
    static int n; //입력받을 층

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//입력을 위함

        n = Integer.parseInt(br.readLine()); //전역변수 입력받음(층)
        arr = new int[n][n];//배열의 크기
        dp = new Integer[n][n]; //경로합
        StringTokenizer st;//출력을 위함
        
        for (int i = 0; i < n; i++) { //
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < i + 1; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken()); //삼각형 배열 입력
            }
        }
        
        for (int i = 0; i < n; i++) {
            dp[n - 1][i] = arr[n - 1][i]; //맨 마지막줄 ->삼각형합을 경로합에 그대로 입력함
        }
        
        System.out.println(find(0, 0)); //메인 알고리즘 실행
    }

    static int find(int depth, int idx) { // depth는 행 idx 는 열
        //마지막 행 -> 현재 위치의 dp값 반환
        if(depth==n-1) return dp[depth][idx];

        //탐색하지 않았던 값일 경우, 다음 행의 양쪽 값 비교해서 큰 값과 더해줌(재귀)
        if(dp[depth][idx]==null){
            dp[depth][idx] = Math.max(find(depth + 1, idx), find(depth + 1, idx + 1)) + arr[depth][idx];
        }
        return dp[depth][idx]; //현재 경로합을 반환함
    }
}
