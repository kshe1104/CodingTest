
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int x = sr.nextInt();
        int y = sr.nextInt();
        int w = sr.nextInt();
        int h = sr.nextInt();

        int min_x = Math.min(x,w-x);
        int min_y = Math.min(y,h-y);
        int min = Math.min(min_y,min_x);

        System.out.println(min);
        
    }
}