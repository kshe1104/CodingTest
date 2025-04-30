import java.util.*;
public class Main{
    public static int square(int a,int b){
        return a*b;
    }
    public static void main(String[] args){
        Scanner sr = new Scanner(System.in);
        int a = sr.nextInt();
        int b = sr.nextInt();
        System.out.println(square(a,b));
    }
}