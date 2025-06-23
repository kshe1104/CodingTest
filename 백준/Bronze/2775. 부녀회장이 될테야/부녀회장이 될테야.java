import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);


        int[][] apt = new int[15][15];
        for (int i = 0; i < 15; i++) {
            apt[i][1] = 1;
            apt[0][i] = i;
        }

        for (int i = 1; i < 15; i++) {
            for (int j = 2; j < 15; j++) {
                apt[i][j] = apt[i][j - 1] + apt[i - 1][j];
            }
        }
        int test = sr.nextInt(); //테스트 케이스 수
        for (int i = 0; i < test; i++) {
            int k = sr.nextInt();
            int n = sr.nextInt();
            System.out.println(apt[k][n]);
        }
    }
}