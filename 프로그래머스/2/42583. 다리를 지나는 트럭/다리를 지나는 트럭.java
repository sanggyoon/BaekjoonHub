import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int passed_truck_count = 0;
        int sum_truck_weight = 0;
        
        Deque<Integer> waiting_truck = new ArrayDeque<>();
        for (int truck : truck_weights) {
            waiting_truck.addLast(truck);
        }
        Deque<Integer> passing_truck = new ArrayDeque<>();
        for (int i=0; i<bridge_length; i++) {
            passing_truck.addLast(0);
        }
        
        while (passed_truck_count != truck_weights.length) {
            answer++;
            if (!passing_truck.isEmpty() && passing_truck.peekFirst() > 0) {
                passed_truck_count++;
                sum_truck_weight -= passing_truck.removeFirst();
            } else {
                passing_truck.removeFirst();
            }
            
            if (!waiting_truck.isEmpty() && 
                sum_truck_weight+waiting_truck.peekFirst() <= weight) {
                sum_truck_weight += waiting_truck.peekFirst();
                passing_truck.addLast(waiting_truck.removeFirst());
            } else {
                passing_truck.addLast(0);
            }
        }
        
        return answer;
    }
}