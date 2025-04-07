import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> rank = new ArrayList<>();
        ArrayList<Integer> last_score = new ArrayList<>();
        
        for (int i=0; i<score.length; i++){
            rank.add(score[i]);
            Collections.sort(rank, Collections.reverseOrder());
            
            if (rank.size() >= k){
                last_score.add(rank.get(k-1));
            } else {
                last_score.add(Collections.min(rank));
            }
        }
        
        answer = last_score.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}