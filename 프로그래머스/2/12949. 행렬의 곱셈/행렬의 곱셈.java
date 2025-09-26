class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int r1 = arr1.length; //arr1 행
        int c1 = arr1[0].length; //arr1 열
        int r2 = arr2.length; //arr2 행
        int c2 = arr2[0].length; //arr2 열
        
        int[][] answer = new int[r1][c2]; //결과 저장(arr1의 행 arr2의 열)
        
        for(int i=0;i<r1;i++){//첫번째 배열의 행과
            for(int j=0;j<c2;j++) //두번째의 배열의 열이 곱해서 더한다
            {for(int k=0;k<c1;k++){
                answer[i][j] += arr1[i][k]*arr2[k][j];
            }}
        }
        return answer;
    }
}