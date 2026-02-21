import java.util.*;
class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;
        // 요청 시간 기준 정렬 리스트 생성
        List<int[]> list = new ArrayList<>();
        for (int[] job : jobs) {
            list.add(job);
        }
        Collections.sort(list, (a, b) -> a[0] - b[0]);
        
        // 작업시간 기준 우선순위 큐 생성
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        
        // 반환 시간 계산
        int time = 0;
        int total = 0;
        
        while (!list.isEmpty() || !pq.isEmpty()) {
            if (!list.isEmpty()) {
                // 현재 시간보다 작은 요청 시간을 가진 작업이 없다면 시간 변경
                if (pq.isEmpty() && list.get(0)[0] > time) {
                    time = list.get(0)[0];
                }
                // 현재 시간보다 작거나 같은 요청 시간을 가진 작업 큐에 추가
                while (!list.isEmpty() && list.get(0)[0] <= time) {
                    pq.offer(list.remove(0));
                }
            }
            
            if (!pq.isEmpty()) {
                // 반환 시간 계산
                int[] job = pq.poll();
                int start = job[0];
                int processing = job[1];

                time += processing;
                total += time - start;   
            }
        }
        
        return answer = total / jobs.length;
    }
}