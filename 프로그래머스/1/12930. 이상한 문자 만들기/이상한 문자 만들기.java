import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        boolean isOdd = true;
        
        for (int i=0; i<s.length(); i++){   
            if (s.charAt(i)==' '){
                isOdd = true;
                sb.append(' ');
                continue;
            }
            if (isOdd){
                sb.append(Character.toUpperCase(s.charAt(i)));
                isOdd = false;
            } else {
                sb.append(Character.toLowerCase(s.charAt(i)));
                isOdd = true;
            }
        }
        
        return answer = sb.toString();
    }
}