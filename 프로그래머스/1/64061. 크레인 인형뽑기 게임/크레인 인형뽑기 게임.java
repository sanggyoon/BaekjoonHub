import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        Deque<Integer> stack = new ArrayDeque<>();
        for (int n : moves){
            for (int i=0; i<board.length; i++) {
                int doll = board[i][n-1];
                if (doll == 0) {
                    continue;
                } else if (doll != 0 && stack.isEmpty()) {
                    stack.push(doll);
                    board[i][n-1] = 0;
                    break;
                } else if (doll != 0 && !stack.isEmpty() && stack.peek() != doll) {
                    stack.push(doll);
                    board[i][n-1] = 0;
                    break;
                } else if (doll != 0 && !stack.isEmpty() && stack.peek() == doll) {
                    stack.pop();
                    board[i][n-1] = 0;
                    answer++;
                    break;
                }
            }
        }
        
        return answer*2;
    }
}