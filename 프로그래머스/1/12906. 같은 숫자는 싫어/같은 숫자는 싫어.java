import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        Deque<Integer> ad = new ArrayDeque<>();
        
        for (int n : arr) {
            // System.out.println("선택된 요소: " + n);
            if (ad.isEmpty()) {
                // System.out.println("디큐에 추가");
                ad.addLast(n);
            } else if (ad.peekLast() == n) {
                // System.out.println("패스");
                continue;
            } else {
                // System.out.println("디큐에 추가");
                ad.addLast(n);
            }
        }
        
        List<Integer> list = new ArrayList<>();
        int size = ad.size();
        
        for (int i=0; i<size; i++) {
            // System.out.println("현재 디큐의 크기: " + ad.size());
            // System.out.println("리스트에 추가할 요소: " + ad.peekFirst());
            list.add(ad.removeFirst());
        }
        
        int[] answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}