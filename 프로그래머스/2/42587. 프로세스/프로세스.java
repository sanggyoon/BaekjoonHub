import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a);
        for (int i=0; i<priorities.length; i++) {
            pq.offer(priorities[i]);
        }
        
        int idx = 0;
        while (!pq.isEmpty()) {
            if (priorities[idx] == pq.peek()) {
                answer++;
                if (idx == location) {
                    break;
                }
                System.out.print("일치!");
                System.out.println("idx: " + idx);
                pq.poll();
                idx = (idx+1)%priorities.length; 
                
            } else {
                System.out.print("비일치");
                System.out.println("idx: " + idx);
                idx = (idx+1)%priorities.length;
            }
        }

        return answer;
    }
}