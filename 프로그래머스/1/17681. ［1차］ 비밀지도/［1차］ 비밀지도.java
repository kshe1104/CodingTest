class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] answer2 = new String[n];
        String[] result = new String[n];
        
        for(int i=0;i<n;i++){
            answer[i] = Integer.toBinaryString(arr1[i]);
            answer2[i] = Integer.toBinaryString(arr2[i]);
            result[i] = ""; //초기화
        
        
        while(answer[i].length()<n){
            answer[i]="0"+answer[i]; //자릿수맞추기
        }
        while(answer2[i].length()<n){
            answer2[i]="0"+answer2[i]; //자릿수맞추기
        }
        for(int j=0;j<n;j++){
            if(answer[i].charAt(j)=='1'|| answer2[i].charAt(j)=='1'){
                result[i]+="#";
            }
            else if(answer[i].charAt(j)=='0'||answer2[i].charAt(j)=='0'){
                result[i]+=" ";
            }
        }
        }
        return result;
    }
}
