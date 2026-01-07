import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        // 하나의 문자열로 만들기
        StringBuilder sb = new StringBuilder();
        for (String km : keymap) {
            sb.append(km);    
        }
        String oneLine = sb.toString();
        
        // 타겟 별로 로직 반복해서 배열로 저장
        for (int i=0; i<targets.length; i++) {
            answer[i] = countKey(targets[i], keymap);
        }
        return answer;
    }
    
    // 키 눌리는 횟수 계산 로직
    public int countKey(String target, String[] keymap) {        
        int answer = 0;
        
        // 타겟 문자 순환
        for (int i=0; i<target.length(); i++) {
            char t = target.charAt(i);
            int smaller = 100;
            
            // keymap 문자열에서 타겟 문자의 위치 찾고 가장 작은 값을 smaller에 저장
            for (String km : keymap) {
                if (km.indexOf(t) != -1) {
                    smaller = Math.min(km.indexOf(t)+1, smaller);
                } 
            }
            
            // 만약 최소값이 없다면 불가하므로 더 이상 계산이 무의미, -1 반환
            if (smaller == 100) {
                return -1;
            }
            // 타겟 문자 마다 눌러야 하는 최소값을 전부 더함
            answer += smaller;
        }
    return answer;
    }
}