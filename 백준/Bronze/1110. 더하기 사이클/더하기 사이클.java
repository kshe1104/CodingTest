
import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int N = sr.nextInt(); //숫자 입력
        int M  = N;

        int cnt = 0; //사이클

        int num1;//앞자리
        int num2;//뒷자리
        int num3;//합

        while (true) {
            num1 = N / 10;
            num2 = N % 10;
            num3 = (num1 + num2)%10;
            N = (num2 * 10) + num3;
            cnt++;
            if(N ==M) break;

        }
        System.out.println(cnt);
    }

}