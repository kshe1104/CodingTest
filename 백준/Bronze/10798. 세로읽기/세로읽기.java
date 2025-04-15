import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String word[] = new String[5]; //5개의 단어를 받을 배열
        char arr[][] = new char[5][]; //행렬 5x? 생성

        for(int i=0;i<word.length;i++)
        {
            word[i] = sr.nextLine();
        }
        for(int i =0;i<word.length;i++)
        {
            arr[i] = word[i].toCharArray();
        }

        int maxLength =0; //세로로 출력시 필요한 부분

        for(int i=0;i<word.length;i++) //최대길이 체크 -> 최댓값찾기
        {
            if(word[i].length()>maxLength)
            {
                maxLength=word[i].length(); 
            }
        }

        for(int j=0; j < maxLength; j++) //최대길이만큼 반복
        {
            for(int i=0;i<arr.length;i++)
            {
                if(j<arr[i].length) //단어의 길이가 다를 수 있음 단어 길이 체크하고 범위 벗어나지않도록
                {
                    System.out.print(arr[i][j]);
                }
            }
        }

    }
}