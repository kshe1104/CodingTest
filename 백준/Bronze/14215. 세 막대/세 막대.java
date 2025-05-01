import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int radius = 0;
        int[] line = new int[3];
        for (int i = 0; i < 3; i++) {
            line[i] = sr.nextInt();
        }
        Arrays.sort(line);
        if(line[0]==line[1]&&line[1]==line[2]){
            radius = line[0]*3;
        }
        else if(line[0]+line[1]>line[2]){
            radius = line[0]+line[1]+line[2];
        }
        else if(line[0]+line[1]<=line[2]){
            radius = (2 * (line[0] + line[1])) - 1;
        }
        System.out.println(radius);
    }
}
