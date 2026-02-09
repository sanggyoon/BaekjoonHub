import java.util.*;
class Solution {
    public String solution(String number, int k) {
        String answer = "";
        Deque<Integer> stack = new ArrayDeque<>();
        int st = 0;
        
        for (int i=0; i<number.length(); i++) {
            if (stack.isEmpty() || stack.peek() >= number.charAt(i)-'0') {
                stack.push(number.charAt(i)-'0');
            } else {
                while (!stack.isEmpty() && 
                       stack.peek() < number.charAt(i)-'0' && 
                       st < k) {
                    stack.pop();
                    st++;
                }
                stack.push(number.charAt(i)-'0');
            }
        }
        while (st < k) {
            stack.pop();
            st++;
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.removeLast());
        }
        return answer = sb.toString();
    }
}