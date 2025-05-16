
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        int N = sr.nextInt();
        Integer arr[][] = new Integer[N][2];

        for (int i = 0; i < N; i++) {
            arr[i][0] = sr.nextInt();
            arr[i][1] = sr.nextInt();
        }
        Arrays.sort(arr, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                if (o1[0].equals(o2[0])) {
                    return o1[1] - o2[1];
                }
                else{
                    return o1[0] - o2[0];
                }
            }
        });

        for (int i = 0; i < N; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}