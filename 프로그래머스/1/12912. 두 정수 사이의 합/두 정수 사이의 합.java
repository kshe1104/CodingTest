class Solution {
    public long solution(long a, long b) {
        long answer = 0;
       long min=0;
        long max =0;
        min = Math.min(a,b);
        max = Math.max(a,b);
        for(long i=min;i<=max;i++)
        {answer+=i;}
        return answer;
    }
}