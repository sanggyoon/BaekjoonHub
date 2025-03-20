import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        String tmp = my_string.replaceAll("[^0-9]", "");
        
        int[] answer = new int[tmp.length()];
        for (int i = 0; i < tmp.length(); i++) {
            answer[i] = tmp.charAt(i) - '0'; 
        }
        
        Arrays.sort(answer);
    
        return answer;
    }
}