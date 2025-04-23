import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Set<String> reportSet = new HashSet<>(Arrays.asList(report));
        
        Map<String, Integer> count = new HashMap<>();
        for (String content : reportSet){
            String[] temp = content.split(" ");
            count.put(temp[1], count.getOrDefault(temp[1], 0) + 1);
        }
        
        for (String content : reportSet){
            String[] temp = content.split(" ");
            if (count.get(temp[1]) >= k){
                int index = Arrays.asList(id_list).indexOf(temp[0]);
                answer[index]++;
            }
        }
        
        return answer;
    }
}