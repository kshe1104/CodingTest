import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int[][] arr = new int[9][9];

        for(int i=0;i<9;i++) // 2차원 배열 입력
        {
            for(int j=0;j<9;j++)
            {
                arr[i][j] = sr.nextInt();
            }
        }
        int max = arr[0][0];
        int a=0,b=0;
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(max<arr[i][j])
                {
                    max = arr[i][j];
                a=i;
                b=j;
                }
            }
        }
        System.out.println(max);
        System.out.println((a+1)+" "+(b+1));
    }
}
