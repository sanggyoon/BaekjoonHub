import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pd = new PriorityQueue<>();
        
        for (int s : scoville) {
            pd.offer(s);
        }
        
        while (pd.peek() < K) {
            if (pd.size() ==1 ) return -1;
            int min1 = pd.poll();
            int min2 = pd.poll();
            pd.offer(min1+min2*2);
            answer++;
        }
        return answer;
    }
}