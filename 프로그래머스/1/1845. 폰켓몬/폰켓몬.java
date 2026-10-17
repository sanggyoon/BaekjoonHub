import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> hs = new HashSet<>();
        
        for (int n : nums) {
            hs.add(n);
        }
        
        return (nums.length/2 > hs.size()) ? hs.size() : nums.length/2; 
    }
}