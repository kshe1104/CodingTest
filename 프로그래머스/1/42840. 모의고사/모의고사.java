import java.util.*;

class Solution {
    public int[] solution(int[] answers) { //정답배열을 파라미터로 받음
        
        int[] count = {0,0,0};
        int[] st1 ={1,2,3,4,5};
        int[] st2 = {2,1,2,3,2,4,2,5};
        int[] st3 = {3,3,1,1,2,2,4,4,5,5};
        
        for(int i=0;i<answers.length;i++){
            if(answers[i]==(st1[i%5]))
            {
                count[0]++;
            }
            if(answers[i]==(st2[i%8]))
            {
                count[1]++;
            }
            if(answers[i]==(st3[i%10]))
            {
                count[2]++;
            } 
        }
        int max_score = count[0];
        for(int i=0;i<3;i++)
        {
            if(max_score<count[i])
            {
                max_score = count[i];
            }
        }
        List<Integer> temp = new ArrayList<>();
        for(int i=0;i<count.length;i++)
        {
            if(max_score==count[i])
            {
                temp.add(i+1);
            }
        }
        int[] answer = new int[temp.size()];
        for(int i=0;i<temp.size();i++)
        {
            answer[i] = temp.get(i);
        }
        return answer;
    }
}