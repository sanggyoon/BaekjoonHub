import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int total = 0;
        int[] sorted = new int[d.length];
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i=0; i<d.length; i++){
            list.add(d[i]);
        }
        
        Collections.sort(list);
        sorted = list.stream().mapToInt(i->i).toArray();
        
        for (int j=0; j<sorted.length; j++){
            if (total + sorted[j] <= budget){
                total += sorted[j];
                answer++;
            }
        }
        
        return answer;
    }
}