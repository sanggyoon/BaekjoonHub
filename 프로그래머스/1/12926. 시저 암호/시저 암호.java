import java.util.*;

class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            int ascii = (int)c;
            if (ascii >= 65 && ascii <= 90){
                ascii += n;
                while (ascii > 90){
                    ascii -= 26;
                }
            } else if (ascii >= 97 && ascii <= 122){
                ascii += n;
                while (ascii > 122){
                    ascii -= 26;
                }
            }
            sb.append((char)ascii);
        }
        String answer = sb.toString();
        return answer;
    }
}