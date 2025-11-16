import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> number = new HashSet<>();
        for (int num : nums) number.add(num);
        
        int answer = nums.length/2 >= number.size() ? number.size() : nums.length/2;
        return answer;
    }
}