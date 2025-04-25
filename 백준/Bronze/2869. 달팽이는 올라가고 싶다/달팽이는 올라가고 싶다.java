
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//
////        String[] strs = bf.readLine().split(" ");
//        int A = Integer.parseInt(bf.readLine());
//        int B = Integer.parseInt(bf.readLine());
//        int V = Integer.parseInt(bf.readLine());
//
//        int day = (V - B) / (A - B);
//
//
//        if ((V - B) % (A - B) != 0) {
//            day++;
//        }
//        System.out.println(day);

        Scanner sr = new Scanner(System.in);

        int up = sr.nextInt();
        int down = sr.nextInt();
        int length = sr.nextInt();

        int day = (length - down) / (up - down);

        if ((length - down) % (up - down) != 0) {
            day++;
        }
        System.out.println(day);

}}
