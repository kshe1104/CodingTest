
import java.util.LinkedList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        LinkedList<Integer> arr = new LinkedList<>();
        arr.add(0);
        arr.add(1);
        for (int i = 2; i <= n; i++) {
            if(n<=1)
            {
                break;
            }
            arr.add(arr.get(i - 1) + arr.get(i - 2));
        }
        System.out.println(arr.get(n));

    }
}
