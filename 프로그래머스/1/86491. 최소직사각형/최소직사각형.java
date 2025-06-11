import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int length1 = 0;
        int length2 = 0;
        
        for (int[] size : sizes){
            int max = Math.max(size[0], size[1]);
            int min = Math.min(size[0], size[1]);
            length1 = Math.max(max, length1);
            length2 = Math.max(min, length2);
        }
        answer = length1 * length2;
        
        return answer;
    }
}