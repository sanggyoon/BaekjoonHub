import java.util.*;
class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        String targetColor = board[h][w];
        
        // 위쪽 검사
        if (h > 0 && board[h-1][w].equals(targetColor)) {
            answer++;
        }
        
        // 아래쪽 검사
        if (h < board.length-1 && board[h+1][w].equals(targetColor)) {
            answer++;
        }
        
        // 왼쪽 검사
        if (w > 0 && board[h][w-1].equals(targetColor)) {
            answer++;
        }
        
        // 오른쪽 검사
        if (w < board[0].length-1 && board[h][w+1].equals(targetColor)) {
           answer++; 
        }
        
        return answer;
    }
}