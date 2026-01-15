import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int[] count = new int[2];
        Set<Integer> set = new HashSet<>();
        for (int n : win_nums) set.add(n);
        
        for (int l : lottos) {
            if (set.contains(l)) {
                count[0]++;
                count[1]++;
            } else if (l == 0) {
                count[0]++;
            }
        }
        for (int i=0; i<count.length; i++) {
            if (count[i] > 1) { 
                answer[i] = 7 - count[i];
            } else {
                answer[i] = 6;
            }
        }
        return answer;
    }
}