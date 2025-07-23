
import java.io.*;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //입력
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));//출력

        String[] input = reader.readLine().split(" ");//공백을 기준으로 다른 객체로 입력
        int N = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        StringBuilder result = new StringBuilder(); //문자열을 합쳐서 출력하기 위한 객체

        result.append("<");

        int index = 0; //인덱스초기화
        while (!list.isEmpty()) { //빌때까지 반복 -> 안비어있으면 반복수행
            index = (index + k - 1) % list.size(); //
            //끝난다면 앞으로간다
            //얘가 키포인트!!
            result.append(list.remove(index));//반환해주면서 제거해줌 poll같은 것

            if (!list.isEmpty()) {
                result.append(", ");
            }
        }
        result.append(">");
        writer.write(result.toString());
        writer.flush();
        writer.close();
        reader.close();
    }
}
