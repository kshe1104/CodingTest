
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        
        int n = sr.nextInt(); //테스트 케이스 갯수 입력받기

        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = sr.nextInt();
            arr[i][1] = sr.nextInt();
        }
        
        Arrays.sort(arr,(e1,e2)->{
            if (e1[0] == e2[0]) {
                return e1[1]-e2[1];
            }
            else{
                return e1[0] - e2[0];
            }
        });
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}
