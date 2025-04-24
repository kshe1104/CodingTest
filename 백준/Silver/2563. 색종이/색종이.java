import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int num = sr.nextInt(); //색종이 갯수
        boolean[][] paper = new boolean[100][100];
        int area = 0;

        for(int i=0;i<num;i++)
        {
            int x = sr.nextInt(); //입력
            int y = sr.nextInt();


            for (int r = x; r < x+10; r++) {
                for (int c = y; c < y + 10; c++) {
                    if (!paper[r][c]) {
                        paper[r][c] = true;
                        area++;
                    }
                }
            }
        }
        System.out.println(area);
    }

}
