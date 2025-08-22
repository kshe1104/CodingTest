
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sr = new Scanner(System.in);
        int N = sr.nextInt();
        String[] quiz = new String[N];
        for (int i = 0; i < N; i++) {
            quiz[i] = sr.next(); //입력
        }
        sr.close();

        for (int i = 0; i < quiz.length; i++) {
            int cnt = 0; //연속횟수
            int score = 0; //누적 점수

            for (int j = 0; j < quiz[i].length(); j++) {
                if (quiz[i].charAt(j) == 'O') {
                    cnt++;
                }
                else {
                    cnt = 0;
                }
                score += cnt;
            }
            System.out.println(score);
        }
        

    }

}