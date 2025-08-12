import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        int arr[] = new int[n]; //확인해야할 배열
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sr.nextInt();
        }//배열 입력

        int m = sr.nextInt(); //확인할 숫자들 
        int arr2[] = new int[m];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sr.nextInt(); //입력받기
        }
        
        Set<Integer> set = new HashSet<>();
        //순서x, 중복x
        for (int value : arr) { //arr배열을 set에 추가
            set.add(value);
        }

        for (int i = 0; i < arr2.length; i++) { //arr2의 길이만큼 반복
            if (set.contains(arr2[i])) { //arr2의 값이 있는지 확인
                arr2[i] = 1; //있으면 1로 값바꿈(어차피 Set이라 중복 허용안함)
            }else{
                arr2[i] = 0;
            }
        }

        for (int value : arr2) {
            System.out.println(value);//출력
        }
}}