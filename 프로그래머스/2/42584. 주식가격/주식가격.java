import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        List<Integer> list = new ArrayList<>();
        
        for (int i=0; i<prices.length; i++){
            for (int j=i+1; j<prices.length; j++){
                answer[i]++;
                if (prices[i] > prices[j]) break;
            }
        }
        return answer;
    }
}