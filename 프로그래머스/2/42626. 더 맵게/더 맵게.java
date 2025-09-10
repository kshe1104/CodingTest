import java.util.*;
class Solution {
    public int solution(int[] sco, int K) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
                for (int i : sco) {
            heap.add(i);
        }
        int count = 0;
                while (heap.size() > 1 && heap.peek() < K) {
            int first = heap.poll();
            int second = heap.poll();

            int new_Scovile = first + (second * 2);
            heap.add(new_Scovile);
            count++;

        }if (heap.peek() >= K) {
            return count;
        } else{
            return -1;
        }
  
    }
}