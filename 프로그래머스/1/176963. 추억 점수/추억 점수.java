import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] result = new int[photo.length];
        //이름과 점수로 맵으로 매핑시킴
        Map<String,Integer> scoreMap = new HashMap<>();
        for(int i=0;i<name.length;i++)
        {
            scoreMap.put(name[i],yearning[i]);//입력
        }
        for(int i=0;i<photo.length;i++){
            int sum = 0;
            for(int j=0;j<photo[i].length;j++){
                sum+=scoreMap.getOrDefault(photo[i][j],0);
            }
            result[i]=sum;
        }
return result;
    }
}