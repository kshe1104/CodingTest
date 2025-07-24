
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sr = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = sr.nextInt();

        int[][] test = new int[num][2];

        for (int i = 0; i < test.length; i++) { //행의갯수
            for (int j = 0; j < test[i].length; j++) { //열의갯수만큼 입력
                test[i][j] = sr.nextInt();
            }
        }
        for (int i = 0; i < num; i++) {
            System.out.println("Case #"+(i+1)+": "+test[i][0]+" + "+test[i][1]+" = "+(test[i][0]+test[i][1]));
        }
    }
}
