
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int N = sr.nextInt();
        int k = sr.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=1;i<=N;i++){
            if(N%i==0){
                arr.add(i);
            }
        }
        if(arr.size()>=k){
        int result = arr.get(k-1);
        System.out.println(result);
    }
        else{
            System.out.println(0);
        }
    }
}
