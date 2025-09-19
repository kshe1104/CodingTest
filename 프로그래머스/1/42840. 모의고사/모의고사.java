import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[][] pattern = {{1,2,3,4,5},
                           {2,1,2,3,2,4,2,5},
                           {3,3,1,1,2,2,4,4,5,5}};
        int[] scores = new int[3]; //점수 기록
        
        for(int i=0;i<answers.length;i++){
            for(int j=0;j<pattern.length;j++){
                if(answers[i]==pattern[j][i%pattern[j].length]){
                    scores[j]++;
                }}
            }
        int max_scores = Arrays.stream(scores).max().getAsInt(); //가장 큰 수 저장
        
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=0;i<scores.length;i++){
            if(scores[i]==max_scores){
                answer.add(i+1);
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
        
    }
}