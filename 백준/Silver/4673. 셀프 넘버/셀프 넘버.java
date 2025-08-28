public class Main {
    public static void main(String[] args) {
        boolean[] check = new boolean[10001]; // 1~10000

        for (int i = 1; i < 10001; i++) { // 1~10000까지 반복
            int n = d(i);

            if (n < 10001) { // 10000까지 true로 초기화
                check[n] = true;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < 10001; i++) {
            if (!check[i]) { //false인 인덱스만
                sb.append(i).append('\n');
            }
        }
        System.out.println(sb);
    }

    public static int d(int number) {
        int sum = number; //합

        while (number != 0) { //0이 될 때까지 반복
            sum = sum + (number % 10); //끝자릿수부터 더함
            number = number / 10; //10을 나누어 끝자리를 없앰
        }
        return sum;
    }
}
