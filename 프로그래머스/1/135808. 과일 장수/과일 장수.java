import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        // 오름차순 정렬
        List<Integer> sorted = new ArrayList<>();
        for (int s : score) sorted.add(s);
        Collections.sort(sorted);
        
        // 포함되지 않는 과일 제거
        int rm = score.length % m;
        for (int i=0; i<rm; i++) sorted.remove(0);
        
        // 남은 과일의 최소 무게와 박스당 갯수 곱해서 답에 추가, 박스 수 만큼 반복
        for (int i=0; i<sorted.size(); i+=m) {
            answer += sorted.get(i) * m;
        }
        
        return answer;
    }
}