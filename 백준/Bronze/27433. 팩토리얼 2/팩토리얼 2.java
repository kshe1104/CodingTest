
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        long dup = 1;

        for(int i=1;i<=n;i++)
        {
            if(dup<=0){
                dup = 1;
                break;
            }
            dup *= i;
        }
        System.out.println(dup);
    }
}
