import java.util.*;

public class Solution {
    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        
        // 동명이인을 고려하여 참가자 이름과 숫자 추가
        for (String p : participant) {
            map.put(p, map.getOrDefault(p, 0)+1);
        }
        
        // 완료주자의 이름을 참가자 숫자에서 하나씩 제거
        for (String c : completion) {
            map.put(c, map.getOrDefault(c, 0)-1); 
        }
        
        // 참가자 숫자가 0이 아니라면 answer
        for (String p : participant) {
            if (map.get(p) != 0) {
                answer = p;
            }
        }
        return answer;
    }
}