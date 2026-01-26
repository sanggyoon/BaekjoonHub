import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 1;
        Queue<int[]> q = new ArrayDeque<>();
        for (int i=0; i<priorities.length; i++) {
            q.offer(new int[]{priorities[i], i});
        }
        int target = priorities[location];
        Arrays.sort(priorities);
        
        for (int i=priorities.length-1; i>=0; i--) {
            // 최대값이 앞에 있는 큐
            while (priorities[i] != q.peek()[0]) {
                q.offer(q.poll());
            }
            // 최대값이 타깃이 아님
            if (q.peek()[0] != target) {
                q.poll();
                answer++;
            // 최대값이 타깃임
            } else {
                // 타깃과 인덱스가 같음 -> 정답
                if (q.peek()[0] == target && 
                    q.peek()[1] == location) {
                    return answer;
                // 타깃과 인덱스가 다름 -> 큐에서 빠지고 answer++
                } else if (q.peek()[0] == target && 
                           q.peek()[1] != location) {
                    q.poll();
                    answer++;
                }
            }
        }
        return answer;
    }
}