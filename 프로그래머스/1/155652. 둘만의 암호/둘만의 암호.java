import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        int l = s.length();
        char[] c = new char[l];
        char[] skips = new char[skip.length()];
        
        // 문자열을 char 배열로 반화
        for (int i=0; i<l; i++) {
            c[i] = s.charAt(i);
        }
        
        for (int i=0; i<skip.length(); i++) {
            skips[i] = skip.charAt(i);
        }
        
        // char 배열의 요소 +index 만큼 이동, 이동 중 skip 요소에 해당하면 index 무효
        for (int j=0; j<c.length; j++) {
            for (int k=0; k<index; k++) {
                // z 일경우 a 로 변환, 아니면 a + 1
                if (c[j] == 'z') {
                    c[j] = 'a';
                } else {
                    c[j]++;    
                }
                if (skip.indexOf(c[j]) != -1) {
                    k--;
                }
            }
            answer = String.valueOf(c);
        }
        
        return answer;
    }
}