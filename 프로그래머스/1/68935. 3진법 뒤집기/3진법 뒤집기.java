import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        
        while (n != 0){
            list.add(n%3);
            n /= 3;
        }
        
        int[] reverse = list.stream().mapToInt(i->i).toArray();
        
        int thd = 1;
        for (int i=reverse.length-1; i>=0; i--){
            answer += thd * reverse[i];
            thd *= 3;
        }
        
        return answer;
    }
}
    