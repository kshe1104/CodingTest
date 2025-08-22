
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sr = new Scanner(System.in);

        int[] burgers = new int[3];
        for (int i = 0; i < burgers.length; i++) {
            burgers[i] = sr.nextInt();
        }
        int[] drinks = new int[2];
        for (int i = 0; i < drinks.length; i++) {
            drinks[i] = sr.nextInt();
        }
        Arrays.sort(burgers);
        Arrays.sort(drinks);
        int set = burgers[0] + drinks[0] - 50;
        System.out.println(set);
        
    }

}