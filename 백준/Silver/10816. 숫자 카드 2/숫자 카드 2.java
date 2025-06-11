
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //입력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //출력

        int N = Integer.parseInt(br.readLine()); //상근이가 갖고있는 숫자카드 갯수

        int[] sangeun = new int[N]; //배열만들기

        StringTokenizer st = new StringTokenizer(br.readLine()); //문자열 자르기

        for (int i = 0; i < N; i++) {
            sangeun[i] = Integer.parseInt(st.nextToken()); //상근이 숫자 카드 입력
        }

        int M = Integer.parseInt(br.readLine()); //비교할 숫자카드 갯수

        Arrays.sort(sangeun); //이진탐색을 위한 정렬
        st = new StringTokenizer(br.readLine()); //??

        for (int i = 0; i < M; i++) {
            int value = Integer.parseInt(st.nextToken());
            bw.write(findEndIndex(sangeun, value)-findStartIndex(sangeun,value)+" ");
        }
        br.close();
        bw.flush();
        bw.close();
    }

    private static int findStartIndex(int[] array, int value) {
        // 마지막 인덱스가 아니라 array.length을 한 이유는 개수를 구하기 위해서는 +1을 해줘야하기 때문
        // -10 2 3 3 6 7 10 10 10 => 일때 10의 개수는 3인 것을 볼 수 있다.
        // 10의 인덱스는 7 8 9이다. (배열은 인덱스는 0부터 시작하기 때문에)
        // 만약 마지막 인덱스 9에서 첫번째 인덱스 7를 빼면 2가 된다. => 하지만, 10의 개수는 3개이다.
        // 그렇기 때문에 +1을 해줘야하는데 array.length은 배열의 마지막 인덱스가 아닌 배열의 요소의 수이기 때문에
        // 개수를 구할 수 있게 된다.
        int left = 0;
        int right = array.length;

        while (left < right) {
            int middle = (left + right) / 2;
            if (value <= array[middle]) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }
        return left;
    }

    private static int findEndIndex(int[] array, int value) {
        int left = 0;
        int right = array.length;

        while(left<right){
            int middle = (left + right) / 2;
            if (value < array[middle]) {
                right = middle;
            } else {
                left = middle + 1;
            }
    }
    return left;
    }
}
