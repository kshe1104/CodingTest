
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int num = sr.nextInt();// 점 갯수

        int[] x = new int[num];
        int[] y = new int[num];

        for(int i=0;i<num;i++){
            x[i] = sr.nextInt();
            y[i] = sr.nextInt();
        }

        int max_x = x[0];
        int min_x = x[0];
        int max_y = y[0];
        int min_y = y[0];

        for (int i = 1; i < num; i++) {
            max_x = Math.max(max_x,x[i]);
            min_x = Math.min(min_x,x[i]);
            max_y = Math.max(max_y,y[i]);
            min_y = Math.min(min_y,y[i]);
        }
        int result = (max_x-min_x)*(max_y-min_y);
        System.out.println(result);
    }
}
