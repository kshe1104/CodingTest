import java.util.*;
class Solution {
    public int solution(String s) {
//괄호 정보를 저장함. 코드를 간결하게 할 수 있음.
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');

        int n = s.length(); //원본 문자열의 길이를 저장
        s+=s;//원본문자열 뒤에 원본 문자열을 이어 붙임,2번 나옴
        int answer = 0;
        
        //확인할 문자열의 시작 인덱스를 0부터 n까지 이동
        A:for(int i=0;i<n;i++){
            ArrayDeque<Character> stack = new ArrayDeque<>();
            //i부터 원본 문자열의 길이인 n개까지 올바른 괄호 문자열인지 확인
            for(int j=i;j<i+n;j++){
                char c = s.charAt(j);
                //해시맵 안에 해당 키가 없다면 열리는 괄호임
                if(!map.containsKey(c)){
                    stack.push(c);
                }
                else{
                    //짝이 맞지 않으면 내부 for문은 종료하고 for문 A로 이동
                    if(stack.isEmpty()||!stack.pop().equals(map.get(c))) continue A;
                }
            }
            //3에서 continue되지 않았고, 스택이 비어있으면 올바른 괄호 문자열임
            if(stack.isEmpty()) answer++;
        }
        return answer;
    }
}