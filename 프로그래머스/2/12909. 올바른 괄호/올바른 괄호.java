import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        StringBuilder sb = new StringBuilder(s);
        
        Deque<Character> ad = new ArrayDeque<>();
        for (int i=0; i<s.length(); i++) {
            char c = sb.charAt(i);
            if (c == '(') {
                ad.addLast(c);
            } else if (c == ')' && !ad.isEmpty()) {
                ad.removeLast();
            } else if (c == ')' && ad.isEmpty()){
                answer = false;
            }
        }
        if (!ad.isEmpty()) return false;
        return answer;
    }
}