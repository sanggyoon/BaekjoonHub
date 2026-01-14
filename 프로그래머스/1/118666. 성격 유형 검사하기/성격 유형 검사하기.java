import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        char[] cArr = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
        Map<Character, Integer> map = new HashMap<>();
        for (char c : cArr) {
            map.put(c, 0);
        }
        
        for (int i=0; i<survey.length; i++) {
            char A = survey[i].charAt(0);
            char B = survey[i].charAt(1);
            switch(choices[i]) {
                case 1:
                    map.put(A, map.get(A)+3);
                    break;
                case 2:
                    map.put(A, map.get(A)+2);
                    break;
                case 3:
                    map.put(A, map.get(A)+1);
                    break;
                case 4:
                    break;
                case 5:
                    map.put(B, map.get(B)+1);
                    break;
                case 6:
                    map.put(B, map.get(B)+2);
                    break;
                case 7:
                    map.put(B, map.get(B)+3);
                    break;
            }
        }
        char[][] cArr2 = {{'R', 'T'}, {'C', 'F'}, {'J', 'M'}, {'A', 'N'}};
        StringBuilder sb = new StringBuilder();
        for (char[] ca : cArr2) {
            if (map.get(ca[1]) > map.get(ca[0])) {
                sb.append(ca[1]);
            } else {
                sb.append(ca[0]);
            }
        }
        return answer = sb.toString();
    }
}