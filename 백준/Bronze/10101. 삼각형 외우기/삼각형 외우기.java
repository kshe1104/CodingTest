
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int a = sr.nextInt();
        int b = sr.nextInt();
        int c = sr.nextInt();

        if(!(a+b+c==180))
        {
            System.out.println("Error");
        }
        else{
            if (a == b && b == c) {

                System.out.println("Equilateral");
            } else if (a==b||b==c||a==c){
                System.out.println("Isosceles");
            }
            else{
                System.out.println("Scalene");
            }
        }
    }
}
