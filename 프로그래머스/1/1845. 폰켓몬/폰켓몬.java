import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int chooseMax = nums.length / 2;
        
        Set<Integer> kind = new HashSet<>();
        
        for (int num : nums) {
            kind.add(num);
        }
        
        return answer = Math.min(kind.size(), chooseMax);
    }
}