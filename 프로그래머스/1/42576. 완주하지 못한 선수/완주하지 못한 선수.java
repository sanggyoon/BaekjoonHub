import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> isComplete = new HashMap<>();
        String answer = "";
        
        // 참가자 이름마다 숫자 증가
        for (String Aparticipant : participant){
            isComplete.put(Aparticipant, isComplete.getOrDefault(Aparticipant, 0)+1);
        }
        
        // 완료한 참가자의 이름마다 숫자 감소
        for (String complete : completion){
            isComplete.put(complete, isComplete.getOrDefault(complete, 0)-1);
        }
        
        // 완료하지 못해 참가자의 이름 하나가 1이 됨(조건)
        for (String Aparticipant : participant){
            if (isComplete.get(Aparticipant) > 0){
                answer = Aparticipant;
            }
        }
        return answer;
    }
}