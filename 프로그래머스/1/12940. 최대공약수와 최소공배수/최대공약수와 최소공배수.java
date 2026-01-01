import java.util.*;

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int big = Math.max(n, m);
        int small = Math.min(n, m);
        
        // 최대 공약수 구하기
        for (int i=1; i<=small; i++) {
            if (m % i == 0 && n % i == 0) {
                answer[0] = i;
            }
            // 작은 수 보다 커지면 중지
            if (i > small) {
                break;
            }
        }
        
        // 최소 공배수 구하기
        answer[1] = (n * m) / answer[0];
        
        return answer;
    }
}