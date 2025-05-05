
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);

        int a= sr.nextInt();
        int b= sr.nextInt();
        int c= sr.nextInt();
        int d= sr.nextInt();
        int e= sr.nextInt();
        int f= sr.nextInt();


        int[] x = new int[2000];
        int[] y = new int[2000];
        int n = -999;
        for (int i = 0; i < 2000; i++) {
            x[i]=n;
            y[i]=n;
            n++;
        }
        int result1 = 0;
        int result2 = 0;

        for(int i=0;i<x.length;i++){
            for(int j=0;j<y.length;j++){
        if(a*x[i]+b*y[j]==c){
            if(d*x[i]+e*y[j] ==f){
                result1 = x[i];
                result2 = y[j];
            }
        }}}
        System.out.println(result1 + " " + result2);
    }
}
