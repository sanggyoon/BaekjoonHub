import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int idx = 0;
        int time = 0;
        int bridgeWeight = 0;
        Queue<Integer> q = new ArrayDeque<>();
        for (int i=0; i<bridge_length; i++) {
            q.offer(0);
        }
        
        while (idx < truck_weights.length) {
            time++;
            
            bridgeWeight -= q.poll();
            
            if (bridgeWeight + truck_weights[idx] <= weight) {
                bridgeWeight += truck_weights[idx];
                q.offer(truck_weights[idx]);
                idx++;
            } else {
                q.offer(0);
            }
        }
        return answer = time + bridge_length;
    }
    
    public int getWeight(Queue<Integer> q) {
        int result = 0;
        while (!q.isEmpty()) result += q.poll();
        return result;
    }
}