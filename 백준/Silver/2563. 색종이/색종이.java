import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        
        boolean[][] Square = new boolean[100][100];
        int area = 0;
        int num = sr.nextInt();
        
        for(int i=0;i<num;i++){
            int x = sr.nextInt();
            int y = sr.nextInt();

            for(int j=x;j<x+10;j++){
                for(int k=y;k<y+10;k++){
                    if(!Square[j][k]){
                        Square[j][k] = true;
                        area++;
                    }
                }
            }
        }
        System.out.println(area);

    }
}
