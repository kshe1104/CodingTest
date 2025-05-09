
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine(); //String 입력받음
        char[] ch = s.toCharArray(); //char로 바꿈
        Integer[] num = new Integer[ch.length]; //num 배열생성

        for (int i = 0; i < ch.length; i++) {
            num[i] = ch[i] - '0';
        }
        Arrays.sort(num, Collections.reverseOrder());
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
        }


    }
}
