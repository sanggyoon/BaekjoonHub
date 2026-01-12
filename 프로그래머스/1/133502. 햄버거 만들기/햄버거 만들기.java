import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i : ingredient) {
            stack.push(i);
            int s = stack.size();
            if (s >= 4) {
                if (stack.get(s-1) == 1 &&
                   stack.get(s-2) == 3 &&
                   stack.get(s-3) == 2 &&
                   stack.get(s-4) == 1) {
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    answer++;
                }
            }
        }
        return answer;
    }
}