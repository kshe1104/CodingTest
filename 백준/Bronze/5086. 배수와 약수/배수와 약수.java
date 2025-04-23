import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sr = new Scanner(System.in);
        while(true){
        int a = sr.nextInt();
        int b = sr.nextInt();
           if(a==0&&b==0){
                break;
            }
            else if(a%b==0){
            System.out.println("multiple");
        }
        else if(b%a==0){
          System.out.println("factor");  
        }
      
        else{
            System.out.println("neither");
        }
 
        }
    }
}