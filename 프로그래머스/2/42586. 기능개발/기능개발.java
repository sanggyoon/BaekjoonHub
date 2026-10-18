import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        Deque<Integer> remain_days = new ArrayDeque<>();
        for (int i=0; i<progresses.length; i++) {
            int remain_day = (100-progresses[i]+speeds[i]-1)/speeds[i];
            remain_days.addLast(remain_day);
            // System.out.println(i + "번째 프로세스의 남은 기간: " + remain_day);
        }
        
        Deque<Integer> deploy_stack = new ArrayDeque<>();
        int sum_days = 0;
        while (!remain_days.isEmpty()) {
            // System.out.println("누적일수:"+sum_days+" | 비교일수:"+remain_days.peekFirst());
            if (sum_days < remain_days.peekFirst()) {
                sum_days = remain_days.peekFirst();
                deploy_stack.addLast(1);
                remain_days.removeFirst();
            } else if (sum_days >= remain_days.peekFirst()) {
                deploy_stack.addLast(deploy_stack.removeLast()+1);
                remain_days.removeFirst();
            }
        }
        
        List<Integer> list = new ArrayList<>();
        while (!deploy_stack.isEmpty()) {
            list.add(deploy_stack.removeFirst());
        }
        int[] answer = list.stream().mapToInt(i->i).toArray();
        
        return answer;
    }
}