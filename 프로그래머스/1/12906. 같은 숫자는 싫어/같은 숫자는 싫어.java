import java.util.*;

public class Solution {
    public Stack<Integer> solution(int[] arr){
        int[] answer = {};
        Stack<Integer> stack = new Stack<>(); //스택 만들었음
        
    
        for(int i=0;i<arr.length-1;i++){ //
            if(arr[i]!=arr[i+1]) {
                stack.push(arr[i]);
            }
        }
        stack.push(arr[arr.length-1]);
        return stack;
    }
        }