import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        int m = sr.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        int sum = 0;

        for (int i = n; i <= m; i++) {
            int cnt = 0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    cnt++;
                }
            }
            if(cnt==2){
                arr.add(i);
            }
        }
        for(int i=0;i<arr.size();i++){
            sum += arr.get(i);
        }

        if (arr.isEmpty()) {
            System.out.println(-1);
        }
       else{ System.out.println(sum);
        System.out.println(arr.get(0));}



    }
}
