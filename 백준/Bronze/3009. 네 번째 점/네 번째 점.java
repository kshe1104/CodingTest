
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list_x = new ArrayList<>();
        List<Integer> list_y = new ArrayList<>();

        Scanner sr = new Scanner(System.in);
        int x = 0;
        int y = 0;

        for (int i = 0; i < 3; i++) {
            list_x.add(sr.nextInt());
            list_y.add(sr.nextInt());
        }
        for (int i = 0; i < 3; i++) {
            if (Collections.frequency(list_x, list_x.get(i))==1) {
                x = list_x.get(i);
            }
            if (Collections.frequency(list_y, list_y.get(i))==1) {
                y = list_y.get(i);
            }
        }
        System.out.println(x + " " + y);


    }
}
