import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String,Integer> map = new HashMap<>(); //map -> 시간 복잡도를 줄임
        
        //참가자 전원 추가
        for(String p : participant){
            map.put(p,map.getOrDefault(p,0)+1);
        }
        
        //완주한 사람제거
        for(String c: completion){
            int n = map.get(c)-1;
            if(n==0) map.remove(c);
            else map.put(c,n);
        }
        
        return map.keySet().iterator().next();
    }
}