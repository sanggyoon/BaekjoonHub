import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for (int p : people) {
            list.add(p);
        }
        Collections.sort(list);
        
        int first = 0;
        int last = list.size()-1;
        
        while (first <= last) {
            if (list.get(last) + list.get(first) <= limit) {
                last--;
                first++;
                answer++;
            } else {
                last--;
                answer++;
            }
        }
        
        return answer;
    }
}