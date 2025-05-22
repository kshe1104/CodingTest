import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sr.nextInt();
        }

        int m = sr.nextInt();
        int arr2[] = new int[m];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sr.nextInt();
        }
        
        Set<Integer> set = new HashSet<>();
        for (int value : arr) {
            set.add(value);
        }

        for (int i = 0; i < arr2.length; i++) {
            if (set.contains(arr2[i])) {
                arr2[i] = 1;
            }else{
                arr2[i] = 0;
            }
        }

        for (int value : arr2) {
            System.out.println(value);
        }
}}