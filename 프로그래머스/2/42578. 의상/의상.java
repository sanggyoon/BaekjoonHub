import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> hm = new HashMap<>();
        for (String[] clothe : clothes) {
            hm.put(clothe[1], hm.getOrDefault(clothe[1], 0) + 1);
        }
        
        for (int n : hm.values()) {
            answer *= n+1;
        }
        
        return answer-1;
    }
}